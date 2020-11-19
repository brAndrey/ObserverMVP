package com.example.observermvp.screens.farstFragment;

import android.util.Log;

import com.example.observermvp.database.ElementDataBase;
import com.example.observermvp.model.BaseModel;

public class FarstFragmentModel implements FragmentFirstContracts.Model {
    @Override
    public BaseModel gatData() {
        return null;
    }

    @Override
    public void setData(double weight, double speed) {
        Log.e("FarstFragmentModel", "setData "+weight+ " "+speed +"  "+System.currentTimeMillis());
        ElementDataBase elementDataBase = ElementDataBase.getInstance();
        elementDataBase.setBaseModel(weight,speed);
//        MaySiglton maySiglton = MaySiglton.getInstance();
//        maySiglton.getTime();

    }

}
