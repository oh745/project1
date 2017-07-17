package com.example.preedaphongr.projecttest;

import android.app.Application;

import com.example.preedaphongr.projecttest.component.DaggerNetComponent;
import com.example.preedaphongr.projecttest.component.NetComponent;
import com.example.preedaphongr.projecttest.module.NetModule;
import com.example.preedaphongr.projecttest.module.WebServiceModule;

/**
 * Created by preedaphong.r on 17/07/2560.
 */

public class MyApplication extends Application {

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent = createComponent();
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }

    protected NetComponent createComponent(){
        return DaggerNetComponent.builder()
                .netModule(new NetModule())
                .webServiceModule(new WebServiceModule())
                .build();
    }
}
