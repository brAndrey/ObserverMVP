package com.example.observermvp.activities;

//import MainActivityContract;

import com.example.observermvp.activities.MainActivityContract;

public class MainActivityModel implements MainActivityContract.Model {
    @Override
    public String gatData() {
        return " Слово ";
    }
}
