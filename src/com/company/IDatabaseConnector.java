package com.company;

public interface IDatabaseConnector {
    void startnewConnection();
    void stopConnection();
    boolean isUser(User user);
    void putMessage(String message);
    String getallMessage(User user);
    void newUser(User user);
    void checkToken(User user);
}
