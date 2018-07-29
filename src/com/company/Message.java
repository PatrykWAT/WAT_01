package com.company;

import java.util.Date;

public class Message {

    private String id;
    private String from;
    private String to;
    private String meaage;
    private Date date;
    private String hash;

    public Message(String id, String from, String to, String meaage, Date date, String hash) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.meaage = meaage;
        this.date = date;
        this.hash = hash;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMeaage() {
        return meaage;
    }

    public void setMeaage(String meaage) {
        this.meaage = meaage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
