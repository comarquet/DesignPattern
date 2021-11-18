package com.company;

public class TextDocument extends Document {
    private String content;

    public TextDocument(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Printing Text Document : ");
        System.out.println(content);
    }
}
