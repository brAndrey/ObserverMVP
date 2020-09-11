package com.example.observermvp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;


import com.example.observermvp.screens.farstFragment.Fragment1;
import com.example.observermvp.screens.second_fragment.Fragment2;
//import MainActivityPresenter;
import com.example.observermvp.R;
//import MainActivityContract;

public class MainActivity extends AppCompatActivity  implements MainActivityContract.View {

    private MainActivityContract.Presenter mPresenter;
    private FrameLayout framegmentConteyner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainActivityPresenter(this);

        String name = new Object(){}.getClass().getEnclosingMethod().getName();
       // Log.e("MainActivity",name);

        FragmentManager fm = getSupportFragmentManager();

        Fragment fragment = fm.findFragmentById(R.id.fragmentConteiner);

        if (fragment == null) {
            fragment = new Fragment1();
            fm.beginTransaction().
                    add(R.id.fragmentConteiner, fragment)
                    .commit();
        }


        Fragment fragment1 = fm.findFragmentById(R.id.fragmentConteiner2);
        if (fragment1 == null) {
            fragment1 = new Fragment2();
            fm.beginTransaction().
                    add(R.id.fragmentConteiner2, fragment1)
                    .commit();
        }


    }

    @Override
    public void initView() {


    }

    @Override
    public void setViewData(String data) {
        //mTextView.setText(data);
    }
}
// over https://android-tools.ru/coding/ispolzovanie-patterna-mvp-v-android/