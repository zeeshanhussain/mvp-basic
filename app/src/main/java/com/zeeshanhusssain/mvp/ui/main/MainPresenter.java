package com.zeeshanhusssain.mvp.ui.main;

import com.zeeshanhusssain.mvp.data.DataManager;
import com.zeeshanhusssain.mvp.ui.base.BasePresenter;
import com.zeeshanhusssain.mvp.ui.main.MainMvpPresenter;
import com.zeeshanhusssain.mvp.ui.main.MainMvpView;

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }

}