package com.example.ducpm.mvvmpexample.screen.Player;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Exposes the data to be used in the Player screen.
 */

public class PlayerViewModel extends BaseObservable implements PlayerContract.ViewModel  {

    private PlayerContract.Presenter mPresenter;
    private String mName;
    private String mNickName;

    public PlayerViewModel(String name, String nickName) {
        mName = name;
        mNickName = nickName;
    }

    @Override
    public void onStart() {
        mPresenter.onStart();
    }

    @Override
    public void onStop() {
        mPresenter.onStop();
    }

    @Override
    public void setPresenter(PlayerContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Bindable
    String getNickName() {
        return mNickName;
    }

    void setNickName(String nickName) {
        mNickName = nickName;
    }

    @Bindable
    String getName() {
        return mName;
    }

    void setName(String name) {
        mName = name;
    }
}
