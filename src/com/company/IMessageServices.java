package com.company;

public interface IMessageServices {

    boolean sendMessage(String message);
    String receiveMessage();
    boolean signUp(String token);
    boolean signIn(String data);

}
