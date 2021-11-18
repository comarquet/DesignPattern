package com.company;

public class HTMLDocument extends Document {
    private String content;

    public HTMLDocument(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Printing HTML Document : ");
        System.out.println(content);
    }
}
