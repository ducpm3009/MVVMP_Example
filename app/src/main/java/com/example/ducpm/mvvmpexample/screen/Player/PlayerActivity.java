package com.example.ducpm.mvvmpexample.screen.Player;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import com.example.ducpm.mvvmpexample.BaseActivity;
import com.example.ducpm.mvvmpexample.R;
import com.example.ducpm.mvvmpexample.databinding.ActivityPlayerBinding;

/**
 * Player Screen.
 */
public class PlayerActivity extends BaseActivity {

    private PlayerContract.ViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String name = "Ma boy amir  ";
        String nickName = "Miraclul";
//        mViewModel = new PlayerViewModel(player);

        PlayerContract.Presenter presenter = new PlayerPresenter(mViewModel);
        mViewModel.setPresenter(presenter);

        ActivityPlayerBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_player);
        binding.setViewModel((PlayerViewModel) mViewModel);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mViewModel.onStart();
    }

    @Override
    protected void onStop() {
        mViewModel.onStop();
        super.onStop();
    }
}
