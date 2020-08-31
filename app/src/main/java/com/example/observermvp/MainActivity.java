package com.example.observermvp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jakewharton.rxbinding.view.RxView;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

  //  @BindView(R.id.bottom)
    Button mBotton;
//
 //   @BindView(R.id.textView)
    TextView mTextView;

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

        framegmentConteyner = (FrameLayout) findViewById(R.id.fragmentConteiner);

        FragmentManager fm = getSupportFragmentManager();

        Fragment fragment = fm.findFragmentById(R.id.fragmentConteiner);

        if (fragment == null) {
            fragment = new Fragment1();
            fm.beginTransaction().add(R.id.fragmentConteiner, fragment)
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
//
//
//        mBotton.setOnClickListener((view)-> {
//                mPresenter.onClick(view);}
//        );
    }

    @Override
    public void setViewData(String data) {
        mTextView.setText(data);
    }
}