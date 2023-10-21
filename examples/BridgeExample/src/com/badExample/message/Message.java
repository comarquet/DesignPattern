package com.badExample.message;


public abstract class Message {

    protected String title;
    protected String body;
    protected int importance;



    public Message(String title, String body, int importance) {
        this.title = title;
        this.body = body;
        this.importance = importance;
    }


    public abstract void send();

}