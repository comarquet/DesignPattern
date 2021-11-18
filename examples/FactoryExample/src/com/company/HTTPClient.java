package com.company;

import java.util.Random;

public class HTTPClient {
    public static String receiveDocumentContent() {
        Random randomGenerator = new Random();
        if (randomGenerator.nextBoolean()) {
            return "<html><body><h1>Hello</h1></body></html>";
        } else {
            return "Hello\nWorld\n";
        }
    }
}
