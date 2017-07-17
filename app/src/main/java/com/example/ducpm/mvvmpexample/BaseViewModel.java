package com.example.ducpm.mvvmpexample;

/**
 * Created by ducpm on 17/07/17.
 */

public interface BaseViewModel<T extends BasePresenter> {


    void onStart();

    void onStop();

    void setPresenter(T presenter);
}
