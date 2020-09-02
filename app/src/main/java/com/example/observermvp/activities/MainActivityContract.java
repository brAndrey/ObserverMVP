
package com.example.observermvp.activities;

public interface MainActivityContract {

    interface View {

        void initView();

        void setViewData(String data);
    }

    interface Model {
        String gatData();
    }

    interface Presenter {
        void onClick (android.view.View view);
    }
}
