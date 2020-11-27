package com.company;

public class BooksCollection implements IIterableCollection {
    private String m_titles[] = {"Design Patterns", "1", "2", "3", "4"};




    public IIterator getIterator() {
        BookIterator result = new BookIterator();
        return result;
    }







    private class BookIterator implements IIterator {
        private int m_position;

        public BookIterator() {
            this.m_position = 0;
        }

        public boolean hasNext() {
            if (m_position < m_titles.length) {
                return true;
            } else {
                return false;
            }
        }

        public String next() {
            if (this.hasNext()) {
                String currentTitle = m_titles[m_position];
                m_position++;
                return currentTitle;
            } else {
                return null;
            }
        }
    }
}
