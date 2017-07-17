package com.example.preedaphongr.projecttest.service;

import com.example.preedaphongr.projecttest.api.SearchAPI;
import com.example.preedaphongr.projecttest.model.SearchRequest;
import com.example.preedaphongr.projecttest.model.SearchResponse;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Call;

/**
 * Created by preedaphong.r on 17/07/2560.
 */
@Singleton
public class SearchService {
    public SearchAPI searchAPI;

    @Inject
    public SearchService(SearchAPI searchAPI){
        this.searchAPI = searchAPI;
    }

    public Call<SearchResponse> loadRestaurant(SearchRequest searchRequest){
        return searchAPI.getRestaurant(searchRequest);
    }

}
