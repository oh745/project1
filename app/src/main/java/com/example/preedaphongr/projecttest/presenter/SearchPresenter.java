package com.example.preedaphongr.projecttest.presenter;


import android.content.Context;
import android.util.Log;

import com.example.preedaphongr.projecttest.model.Restaurant;
import com.example.preedaphongr.projecttest.model.SearchRequest;
import com.example.preedaphongr.projecttest.model.SearchResponse;
import com.example.preedaphongr.projecttest.service.SearchService;
import com.example.preedaphongr.projecttest.util.RetrofitSearch;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by preedaphong.r on 13/07/2560.
 */

public class SearchPresenter {

    private View view;
    private Context context;


    public interface View{
        void showRestaurant(SearchResponse searchResponse);
    }

    public SearchPresenter(View view, Context context) {
        this.view = view;
        this.context = context;
    }

    public void sendSearchRequest(String word){
        SearchService git = RetrofitSearch.getRetrofit().create(SearchService.class);
        Call call = git.getUser(new SearchRequest(word));
        call.enqueue(new Callback<SearchResponse>() {
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
