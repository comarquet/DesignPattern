package com.company;

import java.util.AbstractList;
import java.util.ArrayList;

public class Library implements IterableCollectionInterface {

    public AbstractList<Book> bookList;

    public Library() {
        bookList = new ArrayList<>();
        this.bookList.add(new Book("Harry Potter"));
        this.bookList.add(new Book("Le père Goriot"));
        this.bookList.add(new Book("Les Particules élémentaires"));
        this.bookList.add(new Book("Design Patterns"));
    }

    public IteratorInterface<Book> getIterator() {
        return new LibraryIterator(this);
    }
}
