package com.example.ducpm.mvvmpexample.screen.Player;
import com.example.ducpm.mvvmpexample.BaseViewModel;
import com.example.ducpm.mvvmpexample.BasePresenter;

/**
 * This specifies the contract between the view and the presenter.
 */
interface PlayerContract {
    /**
     * View.
     */
    interface ViewModel extends BaseViewModel<Presenter> {
        void setPresenter(Presenter presenter);
    }

    /**
     * Presenter.
     */
    interface Presenter extends BasePresenter {
    }
}
