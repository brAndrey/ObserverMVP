package com.example.observermvp.database;

import com.example.observermvp.model.BaseModel;

public class ElementDataBase {

    private static ElementDataBase INSTANCE;
    BaseModel baseModel;

    private ElementDataBase() {

      baseModel  = new BaseModel();
    }

    public static ElementDataBase getInstance() {
        if (INSTANCE == null) {
            synchronized (ElementDataBase.class) {
                INSTANCE = new ElementDataBase();
            }
        }
        return INSTANCE;
    }

    public void setBaseModel(int weight,int speed ){
        baseModel.setWeight(weight);
        baseModel.setSpeed(speed);
    };

}
