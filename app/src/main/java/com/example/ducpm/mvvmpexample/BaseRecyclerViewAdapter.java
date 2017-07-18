package com.example.ducpm.mvvmpexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

/**
 * Created by ducpm on 18/07/17.
 */

public abstract class BaseRecyclerViewAdapter<V extends RecyclerView.ViewHolder>
        extends RecyclerView.Adapter<V> {
        private Context mContext;

    protected BaseRecyclerViewAdapter(Context context) {
        mContext = context;
    }

    Context getContext() {
        return mContext;
    }

    void setContext(Context context) {
        mContext = context;
    }
    public interface OnRecyclerViewItemClickListener<T>{
        void onItemRecyclerViewClick(T item);
    }
}
