package com.example.preedaphongr.projecttest.module;

import com.example.preedaphongr.projecttest.api.SearchAPI;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.preedaphongr.projecttest.module.NetModule.CALLBACK;

/**
 * Created by preedaphong.r on 17/07/2560.
 */
@Module
public class NetModule {
    public static final String CALLBACK = "callback";

    @Provides
    @Singleton
    @Named(CALLBACK)
    Retrofit provideRetrofit(){
        Retrofit retrofit;
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://10.215.136.219/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        return retrofit;
    }


}
