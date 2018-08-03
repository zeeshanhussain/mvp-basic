package com.zeeshanhusssain.mvp;

import android.app.Application;

import com.zeeshanhusssain.mvp.data.DataManager;
import com.zeeshanhusssain.mvp.data.SharedPrefsHelper;

public class MvpApp extends Application {

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);

    }

    public DataManager getDataManager() {
        return dataManager;
    }
}
