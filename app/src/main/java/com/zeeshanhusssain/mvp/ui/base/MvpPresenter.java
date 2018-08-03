package com.zeeshanhusssain.mvp.ui.base;

public interface MvpPresenter<V extends MvpView> {
    void onAttach(V MvpView);
}
