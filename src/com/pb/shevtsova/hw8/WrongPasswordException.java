package com.pb.shevtsova.hw8;

public class WrongPasswordException extends Exception{

    private String password;

    public WrongPasswordException(String password) {
        this.password = password;
    }

    public WrongPasswordException(String message, String password) {
        super(message);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
