package com.example.preedaphongr.projecttest.service;

import com.example.preedaphongr.projecttest.model.Restaurant;
import com.example.preedaphongr.projecttest.model.SearchRequest;
import com.example.preedaphongr.projecttest.model.SearchResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by preedaphong.r on 13/07/2560.
 */

public interface SearchService {
    @POST("searchData")
    Call<SearchResponse> getUser(@Body SearchRequest searchRequest);
}
