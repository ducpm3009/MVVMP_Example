package com.example.ducpm.mvvmpexample.data.source.local;

import android.provider.BaseColumns;

/**
 * Created by ducpm on 17/07/17.
 */

public class PlayerLocalContract {
    public static class TaskEntry implements BaseColumns {
        public static final String TABLE_NAME = "player_table";
        public static final String COLUMN_NICK_NAME = "player_nick_name";
        public static final String COLUMN_NAME = "player_name";
    }

}
