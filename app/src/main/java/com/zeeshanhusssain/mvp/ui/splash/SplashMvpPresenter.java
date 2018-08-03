package com.zeeshanhusssain.mvp.ui.splash;

import com.zeeshanhusssain.mvp.ui.base.MvpPresenter;

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {
    void decideNextActivity();
}
