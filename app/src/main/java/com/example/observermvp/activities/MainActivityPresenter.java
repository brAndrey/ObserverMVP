package com.example.observermvp.activities;

import android.view.View;

import com.example.observermvp.activities.MainActivityContract;
import com.example.observermvp.activities.MainActivityModel;

//import MainActivityContract;
//import MainActivityModel;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View mViev;
    private MainActivityContract.Model mModel;

    public MainActivityPresenter (MainActivityContract.View view){
        mViev = view;
        initPresenter();
    }

    private void initPresenter() {
        mModel = new MainActivityModel();
        mViev.initView();
    }


    @Override
    public void onClick(View view) {
        String data = mModel.gatData();
        mViev.setViewData(data);

    }
}
