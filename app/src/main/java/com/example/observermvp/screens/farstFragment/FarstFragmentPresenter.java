package com.example.observermvp.screens.farstFragment;

import android.view.View;

import com.example.observermvp.activities.MainActivityContract;
import com.example.observermvp.activities.MainActivityModel;
import com.example.observermvp.model.BaseModel;

public class FarstFragmentPresenter implements FragmentFirstContracts.Presenter {

    private FragmentFirstContracts.View mViev;
    private FragmentFirstContracts.Model mModel;

    public FarstFragmentPresenter (FragmentFirstContracts.View view){
        mViev = view;
        initPresenter();
    }

    private void initPresenter() {
        mModel = new FarstFragmentModel();
        mViev.initView();
    }


    @Override
    public void onClick(double weight,double speed) {

        mModel.setData(weight,speed);

        //String data = mModel.gatData();

        //mViev.setViewData(data);
    }


}
