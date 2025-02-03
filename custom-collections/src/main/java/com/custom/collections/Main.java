package com.custom.collections;

import com.custom.collections.mycollections.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.put(23);
        list.put(9);
        list.put(2000);

        for(int n : list){
            System.out.println(n);
        }
    }
}