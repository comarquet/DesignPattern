package com.company;

public class Main {

    public static void main(String[] args) {
        Library bookCollection = new Library();

        for (IteratorInterface<Book> it = bookCollection.getIterator(); it.hasNext(); ) {
            Book book = it.next();
            System.out.println("book title : " + book.getTitle());
        }
    }
}

