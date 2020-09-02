package com.example.observermvp.screens.farstFragment;

import com.example.observermvp.model.BaseModel;

public interface FragmentFirstContracts  {

    interface View {

        void initView();

    }

    interface Model {
        BaseModel gatData();

        void setData(int weight, int speed);

    }

    interface Presenter {
        void onClick (int weight,int speed);
    }
}
