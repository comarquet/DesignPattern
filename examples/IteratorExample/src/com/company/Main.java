package com.company;

public class Main {

    public static void main(String[] args) {
        BooksCollection bookCollection = new BooksCollection();

        
        for (IIterator it = bookCollection.getIterator(); it.hasNext(); ) {
            String bookTitle = (String)it.next();
            System.out.println("book title : " + bookTitle);
        }
    }
}

