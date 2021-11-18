package com.solution;

import com.company.Book;
import com.company.IterableCollectionInterface;
import com.company.IteratorInterface;

import java.util.ArrayList;
import java.util.List;

public class Library implements IterableCollectionInterface<Book> {
    protected List<Book> books = new ArrayList<Book>();

    public Library() {
        this.books.add(new Book("Harry Potter"));
        this.books.add(new Book("Le père Goriot"));
        this.books.add(new Book("Les Particules élémentaires"));
        this.books.add(new Book("Design Patterns"));
    }

    public IteratorInterface<Book> getIterator() {
        BookIterator iterator = new BookIterator();
        return iterator;
    }


    private class BookIterator implements IteratorInterface<Book> {
        private int iteratorPosition;
        public BookIterator() {
            this.iteratorPosition = 0;
        }

        public boolean hasNext() {
            if (iteratorPosition < books.size()) {
                return true;
            } else {
                return false;
            }
        }

        public Book next() {
            if (this.hasNext()) {
                Book currentBook = books.get(iteratorPosition);
                iteratorPosition++;
                return currentBook;
            } else {
                return null;
            }
        }
    }
}
