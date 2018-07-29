package com.company;

public class User {

    private String number;
    private String token;

    public User(String number, String token) {
        this.number = number;
        this.token = token;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
