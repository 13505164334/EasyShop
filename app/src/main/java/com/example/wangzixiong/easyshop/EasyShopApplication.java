package com.example.wangzixiong.easyshop;

import android.app.Application;

import com.example.wangzixiong.easyshop.model.CachePreferences;

public class EasyShopApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化本地配置
        CachePreferences.init(this);
    }
}
