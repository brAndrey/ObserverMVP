package com.example.observermvp.screens.second_fragment;

import com.example.observermvp.model.BaseModel;

public interface FragmentSecondContracts {

    interface View {

        void initView();

        void setViewData(String data);

    }

    interface Model {

        String getData();

        BaseModel setData();

    }

    interface Presenter {
        void onClick ();
    }
}
