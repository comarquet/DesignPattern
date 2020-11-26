package com.company;

public class Message {


    protected MessageSenderBase messageSender;
    protected String title;
    protected String body;
    protected int importance;



    public Message(MessageSenderBase messageSender, String title, String body, int importance) {
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
        this.messageSender.SendMessage(this.title, this.body, this.importance);
    };

    public MessageSenderBase getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(MessageSenderBase messageSender) {
        this.messageSender = messageSender;
    }
}