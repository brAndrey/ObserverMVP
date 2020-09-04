package com.example.observermvp.database;

import com.example.observermvp.model.BaseModel;
import com.example.observermvp.utils.MathClass;

import java.util.Observable;

public class ElementDataBase  extends Observable {

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
        baseModel.setEnergy(MathClass.Energy(weight,speed));
        baseModel.toString();
        setChanged();
        notifyObservers();

    };

    public BaseModel getBaseModel(){
        return baseModel;
    };

}
