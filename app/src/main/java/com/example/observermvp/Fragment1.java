package com.example.observermvp;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.observermvp.activities.MainActivityContract;
import com.example.observermvp.activities.MainActivityPresenter;
import com.example.observermvp.screens.farstFragment.FarstFragmentPresenter;
import com.example.observermvp.screens.farstFragment.FragmentFirstContracts;
import com.jakewharton.rxbinding.view.RxView;
import com.jakewharton.rxbinding.widget.RxTextView;

import butterknife.BindView;

public class Fragment1 extends Fragment implements FragmentFirstContracts.View {

    private FragmentFirstContracts.Presenter mPresenter;

  //   @BindView(R.id.buttonFragment1)
    Button mBotton;
    EditText weigtEditText;
    EditText speedEditText;

    View view;



    public final static String TAG = "com.example.observermvp.Fragment1";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_first,container,false);

        mPresenter = new FarstFragmentPresenter(this);

        return view;
    }

    @Override
    public void initView() {

        weigtEditText = view.findViewById(R.id.editTextGrams);
        speedEditText = view.findViewById(R.id.editTextSped);
        mBotton = view.findViewById(R.id.buttonFragment1);


        Log.i("initView  ", "in ");

//        RxTextView.textChanges(weigtEditText)
//                .subscribe(charSequence -> {
//                    Log.i("weigtEditText ", charSequence.toString());
//                });
//
//        RxTextView.afterTextChangeEvents(weigtEditText).
//                subscribe(mayText -> Log.i("afterTextChangeEvents ", weigtEditText.getText().toString()));
//
        RxView.clicks(mBotton).subscribe(aVoid -> {
                    Log.i("RxView ", " клик ");
                    //Toast.makeText(this.getContext(), "RxView. Clisk", Toast.LENGTH_SHORT).show()
                    mPresenter.onClick(Integer.valueOf(weigtEditText.getText().toString()), Integer.valueOf(speedEditText.getText().toString()));
                }

        );


    }


}
