package com.example.observermvp.screens.second_fragment;

import android.util.Log;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.util.Observable;
import java.util.Observer;

public class SecondFragmentPresenter implements FragmentSecondContracts.Presenter, Observer {

    private FragmentSecondContracts.View mViev;
    private FragmentSecondContracts.Model mModel;
    private FrameLayout framegmentConteyner;

    public SecondFragmentPresenter(FragmentSecondContracts.View view){
        mViev = view;
        initPresenter();
    }

    private void initPresenter() {
        mModel = new SecondFragmentModel();
        mViev.initView();
    }


    @Override
    public void onClick() {
        String string = mModel.getData();
        Log.i(SecondFragmentPresenter.class.getSimpleName(),string);
        mViev.setViewData(string);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof SecondFragmentModel) {
            String string = mModel.getData();
            Log.i(SecondFragmentPresenter.class.getSimpleName(),string);
            mViev.setViewData(string);



//            FragmentManager fm = getSupportFragmentManager();
//            Fragment fragment = fm.findFragmentById(R.id.fragmentConteiner2);
//
//            if (fragment instanceof OnActivityDataListenerInterface){
//                mListenetActivity=(OnActivityDataListenerInterface) fragment;
//            } else {
//                throw new RuntimeException(fragment.toString()
//                        + " must implement onActivityDataListener");
//            }
//            mListenetActivity.OnActivityDataListenerST(string);
//            textView.setText(string);

        }
    }
}
