package com.solution;

import com.company.Document;
import com.company.HTMLDocument;
import com.company.TextDocument;

public class DocumentFactory extends AstractDocumentFactory {
    @Override
    public Document createDocument(String content) {
        if (content.startsWith("<html>")) {
            return new HTMLDocument(content);
        } else {
            return new TextDocument(content);
        }
    }
}
