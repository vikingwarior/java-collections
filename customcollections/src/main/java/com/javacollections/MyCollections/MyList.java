package com.javacollections.MyCollections;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {
    private int size;
    private T[] items;

    @SuppressWarnings("unchecked")
    MyList() {
        size = 0;
        items = (T[]) new Object();
    }

    public void addItem(T item) {
        items[size++] = item;
    }

    public T getItemByIndex(int index) {
        return items[index];
    }

    public Iterator<T> iterator() {

        return null;

    }

    private class MyListIterator implements Iterator<T> {

        private MyList<T> myListInstance = new MyList<>();
        private int index = 0;

        MyListIterator(MyList<T> list){
            myListInstance = list;
        }

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
        }

        @Override
        public T next() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'next'");
        }

    }
}
