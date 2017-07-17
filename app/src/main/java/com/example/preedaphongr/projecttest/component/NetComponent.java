package com.example.preedaphongr.projecttest.component;

import com.example.preedaphongr.projecttest.MyApplication;
import com.example.preedaphongr.projecttest.activity.MainActivity;
import com.example.preedaphongr.projecttest.module.NetModule;
import com.example.preedaphongr.projecttest.module.WebServiceModule;
import com.example.preedaphongr.projecttest.presenter.SearchPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by preedaphong.r on 17/07/2560.
 */

@Singleton
@Component(modules = {NetModule.class, WebServiceModule.class})

public interface NetComponent {
    void inject(MyApplication myApplication);
    void inject(MainActivity mainActivity);
    void inject(SearchPresenter searchPresenter);
}
