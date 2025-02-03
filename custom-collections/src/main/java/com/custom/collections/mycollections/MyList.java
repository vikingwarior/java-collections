package com.custom.collections.mycollections;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {
    private int size;
    private T[] items;

    @SuppressWarnings("unchecked")
    public MyList(){
        size = 0;
        items = (T[]) new Object[101];
    }

    public T getItemByIndex(int index){
        return items[index];
    }

    public void put(T item){
        items[size++] = item;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator(this);
    }

    private class MyListIterator implements Iterator<T>{
        private MyList<T> myListInstace;
        int index = 0;

        MyListIterator(MyList<T> list){
            myListInstace = list;
        }

        @Override
        public boolean hasNext() {
            return index < myListInstace.size;
        }

        @Override
        public T next() {
            return myListInstace.items[index++];
        }
    }


}