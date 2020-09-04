package com.example.observermvp.model;

import android.util.Log;

public class BaseModel {

    private int id;
    private String devais;
    private int weight;
    private int speed;
    private int energy;
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

        Log.i(" BaseModel ", weight+" "+speed+" "+energy);

        return null;
    }

    public String getDevais() {
        return devais;
    }

    public void setDevais(String devais) {
        this.devais = devais;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
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