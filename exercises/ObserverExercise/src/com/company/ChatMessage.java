package com.company;

public class ChatMessage {
    protected String author;
    protected String content;

    public ChatMessage(String message) {
        this.author = "anonymous";
        this.content = message;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}
