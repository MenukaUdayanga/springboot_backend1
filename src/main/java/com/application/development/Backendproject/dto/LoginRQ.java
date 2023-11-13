package com.application.development.Backendproject.dto;

import com.application.development.Backendproject.model.Juice;

import java.sql.Time;
import java.util.Date;

public class LoginRQ {

    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
