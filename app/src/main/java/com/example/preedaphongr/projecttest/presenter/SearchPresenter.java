package com.example.preedaphongr.projecttest.presenter;


import android.content.Context;
import android.util.Log;

import com.example.preedaphongr.projecttest.MyApplication;
import com.example.preedaphongr.projecttest.model.SearchRequest;
import com.example.preedaphongr.projecttest.model.SearchResponse;
import com.example.preedaphongr.projecttest.api.SearchAPI;
import com.example.preedaphongr.projecttest.service.SearchService;
import com.example.preedaphongr.projecttest.util.RetrofitSearch;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by preedaphong.r on 13/07/2560.
 */

public class SearchPresenter {

    private View view;
    private Context context;

    @Inject
    private SearchService searchService;

    public interface View{
        void showRestaurant(SearchResponse searchResponse);
    }

    public SearchPresenter(View view, Context context) {
        this.view = view;
        this.context = context;
    }

    public void sendSearchRequest(String word){
        //SearchAPI git = RetrofitSearch.getRetrofit().create(SearchAPI.class);
        //Call call = git.getRestaurant(new SearchRequest(word));
        searchService.loadRestaurant(new SearchRequest(word)).enqueue(new Callback<SearchResponse>() {
            @Override
            public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response) {
                if(response.isSuccessful()){
                    Log.d("test","*******************success************************");
                    view.showRestaurant(response.body());
                }
                else{
                    Log.d("test","*******************unsuccess************************");
                }
            }

            @Override
            public void onFailure(Call<SearchResponse> call, Throwable t) {
                Log.d("test","*******************fail************************");
            }
        });
    }

}
