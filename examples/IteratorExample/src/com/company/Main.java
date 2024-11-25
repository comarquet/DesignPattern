package com.company;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        for (IteratorInterface<Book> it = library.getIterator(); it.hasNext(); ) {
            Book book = it.next();
            System.out.println("book title : " + book.getTitle());
        }
    }
}

