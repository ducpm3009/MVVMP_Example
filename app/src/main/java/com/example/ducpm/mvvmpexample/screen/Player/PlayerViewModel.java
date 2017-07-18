package com.example.ducpm.mvvmpexample.screen.Player;

import android.content.Context;
import android.databinding.BaseObservable;
import com.example.ducpm.mvvmpexample.BaseRecyclerViewAdapter;
import com.example.ducpm.mvvmpexample.data.model.Player;

/**
 * Exposes the data to be used in the Player screen.
 */

public class PlayerViewModel extends BaseObservable implements PlayerContract.ViewModel,
        BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Player> {
    private PlayerAdapter mAdapter;
    private Context mContext;
    private PlayerContract.Presenter mPresenter;

    public PlayerViewModel(PlayerAdapter adapter, Context context) {
        mAdapter = adapter;
        mAdapter.setItemClickListener(this);
        mContext = context;
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

    @Override
    public void onActionSuccess() {

    }

    @Override
    public void onActionFailed(String msg) {

    }

    @Override
    public void onItemRecyclerViewClick(Player item) {

    }

    PlayerAdapter getAdapter() {
        return mAdapter;
    }
}


