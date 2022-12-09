package com.company;

public class Message {
    protected AbstractMessageSender messageSender;

    protected String title;
    protected String body;
    protected int importance;



    public Message(AbstractMessageSender messageSender, String title, String body, int importance) {
        this.messageSender = messageSender;
        this.title = title;
        this.body = body;
        this.importance = importance;
    }

    public Message(String title, String body, int importance) {
        this.title = title;
        this.body = body;
        this.importance = importance;
    }

    public void send() {
        this.messageSender.sendMessage(this.title, this.body, this.importance);
    };

    public AbstractMessageSender getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(AbstractMessageSender messageSender) {
        this.messageSender = messageSender;
    }
}