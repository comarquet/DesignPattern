package com.company;

public class LibraryIterator implements IteratorInterface {
    protected Library library;
    private int i;

    public LibraryIterator(Library library) {
        this.library = library;
        this.i = 0;
    }

    public boolean hasNext() {
        return this.i < this.library.bookList.size();
    }


    public Book next() {
        Book instance = this.library.bookList.get(this.i);
        this.i++;
        return instance;
    }
}
