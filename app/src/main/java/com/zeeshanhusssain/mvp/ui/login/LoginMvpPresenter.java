package com.zeeshanhusssain.mvp.ui.login;

import com.zeeshanhusssain.mvp.ui.base.MvpPresenter;

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);

}