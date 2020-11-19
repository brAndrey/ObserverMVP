package com.example.observermvp.model;

import android.util.Log;

public class BaseModel {

    private int id;
    private String devais;
    private double weight;
    private double speed;
    private double energy;
    private int power;
    private long time;



//    @Override
//    public String toString() {
//        return "AppInfo{" +
//                "packageName='" + packageName + '\'' +"/n"+
//                ", versionCode=" + versionCode +"/n"+
//                ", versionName='" + versionName + '\'' +"/n"+
//                ", name='" + name + '\'' +
//                ", icon=" + icon +
//                '}';
//    }

    @Override
    public String toString(){

        Log.i(" BaseModel ", weight+" "+speed+" "+energy+"  "+System.currentTimeMillis());

        return null;
    }

    public String getDevais() {
        return devais;
    }

    public void setDevais(String devais) {
        this.devais = devais;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

}