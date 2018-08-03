package com.zeeshanhusssain.mvp.ui.login;

import com.zeeshanhusssain.mvp.data.DataManager;
import com.zeeshanhusssain.mvp.ui.base.BasePresenter;
import com.zeeshanhusssain.mvp.ui.login.LoginMvpPresenter;
import com.zeeshanhusssain.mvp.ui.login.LoginMvpView;

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getDataManager().saveEmailId(emailId);
        getDataManager().setLoggedIn();
        getMvpView().openMainActivity();
    }

}