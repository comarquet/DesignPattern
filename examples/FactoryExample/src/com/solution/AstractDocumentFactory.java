package com.solution;

import com.company.Document;

public abstract class AstractDocumentFactory {
    abstract public Document createDocument(String content);
}
