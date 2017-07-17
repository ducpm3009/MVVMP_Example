package com.example.ducpm.mvvmpexample.data.source;

import com.example.ducpm.mvvmpexample.data.model.Player;

/**
 * Created by ducpm on 17/07/17.
 */

public interface PlayerDataSource {
    void addPlayer(Player player, Callback<Boolean> callback);

    void deletePlayer(Player player, Callback<Boolean> callback);

    void editPlayer(Player player, Callback<Boolean> callback);

    void getsPlayer(Callbacks<Player> callbacks);

    interface Callback<T> {
        void onSuccess(T data);

        void onFailed(String msg);
    }

    interface Callbacks<T> {
        void onSuccess(T data);

        void onFailed(String msg);
    }
}
