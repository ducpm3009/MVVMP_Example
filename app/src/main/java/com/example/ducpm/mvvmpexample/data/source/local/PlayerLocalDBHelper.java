package com.example.ducpm.mvvmpexample.data.source.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ducpm on 17/07/17.
 */

public class PlayerLocalDBHelper extends SQLiteOpenHelper {
    public static final int VERSION = 1;
    public static final String DATABASE_NAME = "player.db";
    public static final String SQL_CREATE_TASK = "CREATE TABLE "
            + PlayerLocalContract.TaskEntry.TABLE_NAME
            + "( "
            + PlayerLocalContract.TaskEntry._ID
            + " INTEGER PRIMARY KEY."
            + PlayerLocalContract.TaskEntry.COLUMN_NAME
            + " TEXT)"
            + PlayerLocalContract.TaskEntry.COLUMN_NICK_NAME
            + " TEXT)";
    public static final String SQL_DELETE_PLAYER_TASK =
            "DROP TABLE IF EXISTS " + PlayerLocalContract.TaskEntry.TABLE_NAME;



    public PlayerLocalDBHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DATABASE_NAME);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQL_DELETE_PLAYER_TASK);
        sqLiteDatabase.execSQL(SQL_CREATE_TASK);
    }
}
