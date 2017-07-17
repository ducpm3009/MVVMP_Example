package com.example.ducpm.mvvmpexample.screen.Player;

import com.example.ducpm.mvvmpexample.BaseViewModel;
import com.example.ducpm.mvvmpexample.BasePresenter;
import com.example.ducpm.mvvmpexample.data.model.Player;

/**
 * This specifies the contract between the view and the presenter.
 */
public interface PlayerContract {
    /**
     * View.
     */
    interface ViewModel extends BaseViewModel<Presenter> {
        void setPresenter(Presenter presenter);
        void onActionSuccess();
        void onActionFailed(String msg);
    }

    /**
     * Presenter.
     */
    interface Presenter extends BasePresenter {
        void addPlayer(Player player);

        void deletePlayer(Player player);

        void editPlayer(Player player);

        void getsPlayer();
    }
}
