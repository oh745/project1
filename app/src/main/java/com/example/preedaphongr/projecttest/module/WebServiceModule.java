package com.example.preedaphongr.projecttest.module;

import com.example.preedaphongr.projecttest.api.SearchAPI;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

import static com.example.preedaphongr.projecttest.module.NetModule.CALLBACK;

/**
 * Created by preedaphong.r on 17/07/2560.
 */
@Module
public class WebServiceModule {

    @Provides
    @Singleton
    SearchAPI provideSearchApi(@Named(CALLBACK) Retrofit retrofit){
        return retrofit.create(SearchAPI.class);
    }
}
