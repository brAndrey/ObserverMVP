package com.example.observermvp.screens.second_fragment;

import android.util.Log;

import com.example.observermvp.database.ElementDataBase;
import com.example.observermvp.model.BaseModel;

import java.util.Observable;
import java.util.Observer;

public class SecondFragmentModel  implements FragmentSecondContracts.Model {
    private Observable obsElementDataBase;

//    public SecondFragmentModel() {
//        obsElementDataBase = ElementDataBase.getInstance();
//        obsElementDataBase.addObserver(this::update);
//    }

//    mUserDataRepositoryObservable = UserDataRepository.getInstance();
//        mUserDataRepositoryObservable.addObserver(this);

    @Override
    public String getData() {
        Log.e("SecondFragmentModel", "getData   "+System.currentTimeMillis());
        ElementDataBase elementDataBase = ElementDataBase.getInstance();
        BaseModel baseModel = elementDataBase.getBaseModel();
        return String.valueOf(baseModel.getEnergy()) ;
    }


    @Override
    public BaseModel setData() {
        return null ;
    }


//    @Override
//    public void update(Observable observable, Object o) {
//        // при приходе от репозитория сообщения о его изменении передаём что изменились сами
//        setChanged();
//        notifyObservers();
//    }
}
