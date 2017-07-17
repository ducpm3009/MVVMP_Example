package com.example.ducpm.mvvmpexample.data.model;

/**
 * Created by ducpm on 18/07/17.
 */

public class Player {
    private String mName;
    private String mNickName;
    private int mID;

    public Player(String name, String nickName, int id) {
        mName = name;
        mNickName = nickName;
        mID = id;
    }

    public int getID() {
        return mID;
    }

    void setID(int ID) {
        mID = ID;
    }

    public String getNickName() {
        return mNickName;
    }

    void setNickName(String nickName) {
        mNickName = nickName;

    }

    public String getName() {
        return mName;
    }

    void setName(String name) {
        mName = name;
    }
}
