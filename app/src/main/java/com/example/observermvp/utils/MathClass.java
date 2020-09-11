package com.example.observermvp.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathClass {

    public static double Energy(double weight, double speed){
        double templateDouble = weight*speed*speed/2000;



        double newDouble = new BigDecimal(templateDouble).setScale(3, RoundingMode.UP).doubleValue();

        return  newDouble;
    }




        //System.out.println("New double: " + newDouble);
}
