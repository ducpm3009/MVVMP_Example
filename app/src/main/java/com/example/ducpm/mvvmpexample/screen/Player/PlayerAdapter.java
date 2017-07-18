package com.example.ducpm.mvvmpexample.screen.Player;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.ducpm.mvvmpexample.BaseRecyclerViewAdapter;
import com.example.ducpm.mvvmpexample.R;
import com.example.ducpm.mvvmpexample.data.model.Player;
import com.example.ducpm.mvvmpexample.databinding.ActivityPlayerBinding;
import java.util.List;

/**
 * Created by ducpm on 18/07/17.
 */

public class PlayerAdapter extends BaseRecyclerViewAdapter<PlayerAdapter.ViewHolder> {

    private List<Player> mPlayers;
    private PlayerViewModel mPlayerViewModel;
    private OnRecyclerViewItemClickListener<Player> mItemClickListener;

    protected PlayerAdapter(Context context, List<Player> players) {
        super(context);
        mPlayers = players;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ActivityPlayerBinding binding =
                DataBindingUtil.inflate(inflater, R.layout.player_item, parent, false);
        return new ViewHolder(binding, mItemClickListener, mPlayerViewModel);
    }

    @Override
    public void onBindViewHolder(PlayerAdapter.ViewHolder holder, int position) {
        // TODO: 18/07/17
    }

    void setItemClickListener(OnRecyclerViewItemClickListener<Player> itemClickListener) {
        mItemClickListener = itemClickListener;
    }

    @Override
    public int getItemCount() {
        return mPlayers == null ? 0 : mPlayers.size();
    }

    void setViewModel(PlayerViewModel viewModel) {
        mPlayerViewModel = viewModel;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ActivityPlayerBinding mBinding;
        private OnRecyclerViewItemClickListener<Player> mItemClickListener;
        private PlayerViewModel mPlayerViewModel;

        public ViewHolder(ActivityPlayerBinding binding,
                OnRecyclerViewItemClickListener<Player> listener, PlayerViewModel playerViewModel) {
            super(binding.getRoot());
            mBinding = binding;
            mItemClickListener = listener;
            mPlayerViewModel = playerViewModel;
        }

        //        public void bindData(Player task) {
        // TODO: 18/07/17
        //            if (task != null)
        //                mBinding.setViewModel(
        //                        new Item(task, mItemClickListener, mPlayerViewModel));
        //        }
    }
}

