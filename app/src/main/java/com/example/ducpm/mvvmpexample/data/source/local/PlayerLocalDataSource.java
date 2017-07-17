package com.example.ducpm.mvvmpexample.data.source.local;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.ducpm.mvvmpexample.R;
import com.example.ducpm.mvvmpexample.data.model.Player;
import com.example.ducpm.mvvmpexample.data.source.PlayerDataSource;
import java.util.ArrayList;
import java.util.List;

import static android.provider.BaseColumns._ID;
import static com.example.ducpm.mvvmpexample.data.source.local.PlayerLocalContract.TaskEntry
        .TABLE_NAME;

/**
 * Created by ducpm on 17/07/17.
 */

public class PlayerLocalDataSource extends PlayerLocalDBHelper implements PlayerDataSource {

    public PlayerLocalDataSource(Context context) {
        super(context);
    }

    @Override
    public void addPlayer(Player player, Callback<Boolean> callback) {
        if (player == null) {
            callback.onFailed(String.valueOf(R.string.action_failed));
        }
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(_ID, player.getID());
        contentValues.put(PlayerLocalContract.TaskEntry.COLUMN_NAME, player.getName());
        contentValues.put(PlayerLocalContract.TaskEntry.COLUMN_NICK_NAME, player.getNickName());

        long result = db.insert(TABLE_NAME, null, contentValues);

        if (result != -1) {
            callback.onSuccess(true);
        } else {
            callback.onFailed(String.valueOf(R.string.action_failed));
        }
        db.close();
    }

    @Override
    public void deletePlayer(Player player, Callback<Boolean> callback) {
        SQLiteDatabase db = getWritableDatabase();
        String where = "_ID=?";
        String[] whereArgs = new String[] { String.valueOf(player.getID()) };
        long query = db.delete(TABLE_NAME, where, whereArgs);
        if (query > 0) {
            callback.onSuccess(true);
        } else {
            callback.onFailed(String.valueOf(R.string.action_failed));
        }
        db.close();
    }

    @Override
    public void editPlayer(Player player, Callback<Boolean> callback) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(PlayerLocalContract.TaskEntry.COLUMN_NAME, player.getName());
        String where = "_ID=?";
        String[] whereArgs = new String[] { String.valueOf(player.getID()) };
        long query = db.update(TABLE_NAME, values, where, whereArgs);
        if (query > 0) {
            callback.onSuccess(true);
        } else {
            callback.onFailed(String.valueOf(R.string.action_failed));
        }
        db.close();
    }

    @Override
    public void getsPlayer(Callbacks<Player> callbacks) {
        List<Player> players = new ArrayList<>();
        SQLiteDatabase db = getWritableDatabase();
        String[] collumns = {
                PlayerLocalContract.TaskEntry._ID, PlayerLocalContract.TaskEntry.COLUMN_NAME,
                PlayerLocalContract.TaskEntry.COLUMN_NICK_NAME
        };
        Cursor cursor =
                db.query(PlayerLocalContract.TaskEntry.TABLE_NAME, collumns, null, null, null, null,
                        null, null);
        if (cursor != null && cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(cursor.getColumnIndex(PlayerLocalContract.TaskEntry._ID));
                String name = cursor.getString(
                        cursor.getColumnIndex(PlayerLocalContract.TaskEntry.COLUMN_NAME));
                String nickName = cursor.getString(
                        cursor.getColumnIndex(PlayerLocalContract.TaskEntry.COLUMN_NICK_NAME));
                Player player = new Player(name, nickName, id);
                players.add(player);
            } while (cursor.moveToNext());
        }
        if (cursor != null) {
            cursor.close();
        }
        db.close();
    }
}

