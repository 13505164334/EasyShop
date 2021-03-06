package com.example.wangzixiong.easyshop.model;

import com.google.gson.annotations.SerializedName;

public class UserResult {

    private int code;
    @SerializedName("msg")
    private String message;
    private User user;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
