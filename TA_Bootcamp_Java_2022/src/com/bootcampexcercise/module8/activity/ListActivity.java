package com.bootcampexcercise.module8.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {
    public static void main(String[] args) {

        List myList = new ArrayList();
        myList.add("Tina");
        myList.add("John");
        myList.add(0, "Viktor");


        ListActivity obj = new ListActivity();
        obj.printList(myList);
    }

    void printList(List list){

        Iterator<Object> myIterator = list.iterator();
        System.out.println("***List of Names***");
        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

    }
}
