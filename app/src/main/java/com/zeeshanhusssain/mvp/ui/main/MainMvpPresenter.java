package com.zeeshanhusssain.mvp.ui.main;

import com.zeeshanhusssain.mvp.ui.base.MvpPresenter;

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmailId();

    void setUserLoggedOut();

}