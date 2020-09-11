package com.example.observermvp.screens.second_fragment;

import android.content.Context;
import android.util.Log;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import com.example.observermvp.database.ElementDataBase;

import java.security.acl.Owner;
import java.util.Observable;
import java.util.Observer;

import javax.security.auth.callback.Callback;

public class SecondFragmentPresenter implements LifecycleObserver, FragmentSecondContracts.Presenter,Observer {

    private static final String LOG = SecondFragmentPresenter.class.getSimpleName();

    //private final Object SecondFragmentModel;
    private Observable obsSecondFragmrntModel;

    private FragmentSecondContracts.View mViev;
    private FragmentSecondContracts.Model mModel;
    private FrameLayout framegmentConteyner;

    private Context context;
    private Lifecycle lifecycle;
    //private Owner owner ;

    public SecondFragmentPresenter(FragmentSecondContracts.View view, Lifecycle lifecycle){
        mViev = view;
        initPresenter();

        this.context = context;
        this.lifecycle = lifecycle;
        //this.owner = owner;
        //this.callback = callback;

        // вешаем слушателя состояния на фрагмент
        lifecycle.addObserver(this);


        // подписываемся на Observebler базы данных
        obsSecondFragmrntModel = ElementDataBase.getInstance();
        //SecondFragmentModel.getInstance();

        obsSecondFragmrntModel.addObserver(this);


    }

    private void initPresenter() {
        mModel = new SecondFragmentModel();
        mViev.initView();
    }

//    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
//    void destroy(){Log.d(LOG, " owner : onDestroy ");}

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void start() {
            //Log.d(LOG, " owner+: onStart ");
            upgradeRun();

    }


    @Override
    public void onClick() {
        String string = mModel.getData();
        //Log.i(SecondFragmentPresenter.class.getSimpleName(),string);
        mViev.setViewData(string);
    }

    @Override
    public void update(Observable observable, Object o) {
        //if (observable instanceof SecondFragmentModel) {
           upgradeRun();

    }

    @Override
    public void onDestroyFragment() {
        obsSecondFragmrntModel.deleteObserver(this);
    }

    public void upgradeRun(){
        String string = mModel.getData();
        //Log.i(SecondFragmentPresenter.class.getSimpleName(),string);
        mViev.setViewData(string);
    }
}
