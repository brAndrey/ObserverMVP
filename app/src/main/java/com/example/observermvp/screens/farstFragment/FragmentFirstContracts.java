package com.example.observermvp.screens.farstFragment;

import com.example.observermvp.model.BaseModel;

public interface FragmentFirstContracts  {

    interface View {

        void initView();

    }

    interface Model {
        BaseModel gatData();

        void setData(double weight, double speed);

    }

    interface Presenter {
        void onClick (double weight,double speed);
    }
}
