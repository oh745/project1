package com.example.preedaphongr.projecttest.util;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by preedaphong.r on 14/07/2560.
 */

public class RetrofitSearch {


    private static Retrofit retrofit;
    static{
        retrofit = new Retrofit.Builder()
                .baseUrl("http://10.215.136.219/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static Retrofit getRetrofit(){
        return retrofit;
    }
}
