package com.company;

import com.solution.DocumentFactory;

public class Main {

    public static void main(String[] args) {
        String documentContent = HTTPClient.receiveDocumentContent();

        Document document = new Document(documentContent);

        document.print();
    }
}
