package com.example.observermvp.screens.farstFragment;

import android.util.Log;

import com.example.observermvp.model.BaseModel;

public class FarstFragmentModel implements FragmentFirstContracts.Model {
    @Override
    public BaseModel gatData() {
        return null;
    }

    @Override
    public void setData(int weight, int speed) {
        Log.e("FarstFragmentModel", "setData "+weight+ " "+speed );

    }

}
