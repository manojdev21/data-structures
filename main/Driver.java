package main;

import arrays.Array;
import linkedlist.LinkedList;

public class Driver {

    public static void main(String[] args) {

        // Array
//        Array array = new Array(3);
//        array.print();
//        array.insert(12);
//        array.insert(23);
//        array.insert(33);
//        array.insert(45);
//        array.print();

        // LinkedList
        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(12);
        list.insertAtStart(70);
        list.insertAt(2, 55);
        list.insertAt(0, 1);
        list.deleteAt(2);
        list.show();

    }

}
