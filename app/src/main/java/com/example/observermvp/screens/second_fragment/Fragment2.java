package com.example.observermvp.screens.second_fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.observermvp.R;
import com.example.observermvp.screens.farstFragment.FarstFragmentPresenter;
import com.jakewharton.rxbinding.view.RxView;

public class Fragment2 extends Fragment implements FragmentSecondContracts.View, incomingFragmentSecond{

    TextView textView;
    Button button;
    View view;
    private SecondFragmentPresenter mPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_second,container,false);
        mPresenter = new SecondFragmentPresenter(this);
        return view;
    }

    @Override
    public void initView() {
      textView = view.findViewById(R.id.textViewFragment2);
      button=view.findViewById(R.id.buttonFragment2);

      RxView.clicks(button).subscribe(aVoid -> {
                    Log.i("RxView ", " клик ");
                    mPresenter.onClick();
                }

        );

    }

    @Override
    public void setViewData(String enegy) {
        textView.setText(enegy);
    }

    @Override
    public void incomingPresenter() {
    }
}
