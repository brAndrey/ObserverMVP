package com.example.observermvp.screens.second_fragment;

import android.util.Log;

import com.example.observermvp.database.ElementDataBase;
import com.example.observermvp.model.BaseModel;

import java.util.Observable;
import java.util.Observer;

public class SecondFragmentModel extends Observable implements FragmentSecondContracts.Model, Observer {
    private Observable obsElementDataBase;

    public SecondFragmentModel() {
        obsElementDataBase = ElementDataBase.getInstance();
        obsElementDataBase.addObserver(this::update);
    }

//    mUserDataRepositoryObservable = UserDataRepository.getInstance();
//        mUserDataRepositoryObservable.addObserver(this);

    @Override
    public String getData() {

        ElementDataBase elementDataBase = ElementDataBase.getInstance();
        BaseModel baseModel = elementDataBase.getBaseModel();
        return String.valueOf(baseModel.getEnergy()) ;
    }


    @Override
    public BaseModel setData() {
        return null ;
    }


    @Override
    public void update(Observable observable, Object o) {
        ElementDataBase elementDataBase = ElementDataBase.getInstance();
        BaseModel baseModel = elementDataBase.getBaseModel();
        Log.i("update ", String.valueOf(baseModel.getEnergy()) );
        setChanged();
        notifyObservers();

    }
}
