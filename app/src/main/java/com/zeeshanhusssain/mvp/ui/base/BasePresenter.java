package com.zeeshanhusssain.mvp.ui.base;

import com.zeeshanhusssain.mvp.data.DataManager;

public class BasePresenter <V extends MvpView> implements MvpPresenter<V> {
    private V mMvpView;
    DataManager mDataManager;

    public BasePresenter(DataManager dataManager){
        mDataManager=dataManager;

    }
    @Override
    public void onAttach(V mvpView){
        mMvpView=mvpView;
    }
    public V getMvpView(){
        return mMvpView;
    }
    public DataManager getDataManager() {
        return mDataManager;
    }
}

