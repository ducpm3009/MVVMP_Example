package com.example.ducpm.mvvmpexample.screen.Player;

import com.example.ducpm.mvvmpexample.data.model.Player;

/**
 * Listens to user actions from the UI ({@link PlayerActivity}), retrieves the data and updates
 * the UI as required.
 */
final class PlayerPresenter implements PlayerContract.Presenter {
    private static final String TAG = PlayerPresenter.class.getName();

    private final PlayerContract.ViewModel mViewModel;

    public PlayerPresenter(PlayerContract.ViewModel viewModel) {
        mViewModel = viewModel;
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }

    @Override
    public void addPlayer(Player player) {

    }

    @Override
    public void deletePlayer(Player player) {

    }

    @Override
    public void editPlayer(Player player) {

    }

    @Override
    public void getsPlayer() {

    }
}
