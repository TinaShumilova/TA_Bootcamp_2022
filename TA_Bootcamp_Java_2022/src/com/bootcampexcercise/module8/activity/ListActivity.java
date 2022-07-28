package com.bootcampexcercise.module8.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {
    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        List myList = new ArrayList();
        myList.add("Tina");
        myList.add("John");
        myList.add(0, "Viktor");

        //TODO: 2 - Call print method to print the list passed as its parameter.
        ListActivity obj = new ListActivity();
        obj.printList(myList);
    }

    void printList(List list){

        Iterator<Object> myIterator = list.iterator();
        System.out.println("List of Names");
        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

    }
}
