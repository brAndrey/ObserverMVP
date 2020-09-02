package com.example.observermvp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.observermvp.Fragment1;
import com.example.observermvp.screens.Fragment2;
//import MainActivityPresenter;
import com.example.observermvp.R;
import com.jakewharton.rxbinding.widget.RxTextView;
//import MainActivityContract;

public class MainActivity extends AppCompatActivity  implements MainActivityContract.View {



    private MainActivityContract.Presenter mPresenter;
    private FrameLayout framegmentConteyner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //    getLifecycle().addObserver(getData);

        mPresenter = new MainActivityPresenter(this);

        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.e("MainActivity",name);
        //{}.javaClass.enclosingMethod?.name
//
//        framegmentConteyner = (FrameLayout) findViewById(R.id.fragmentConteiner);
//        FrameLayout framegmentConteyner = (FrameLayout) findViewById(R.id.fragmentConteiner);


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

//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.fragmentConteiner, new Fragment1())
//                    .commit();
//        }

    }

    @Override
    public void initView() {

//        mBotton = findViewById(R.id.bottom);
//        mTextView = findViewById(R.id.textView);
//
//
////        RxView.clicks(mBotton).subscribe(aVoid ->
////                Toast.makeText(MainActivity.this,"RxView. Clisk",Toast.LENGTH_SHORT).show());

//RxTextView.textChanges(editText)
//           .subscribe(charSequence -> {
//               textView.setText(charSequence);
//           });
//
//        mBotton.setOnClickListener((view)-> {
//                mPresenter.onClick(view);}
//        );


    }

    @Override
    public void setViewData(String data) {
        //mTextView.setText(data);
    }
}