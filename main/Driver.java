package main;

import arrays.Array;
import linkedlist.LinkedList;
import queue.Queue;
import stack.DynamicStack;
import stack.Stack;

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
//        LinkedList list = new LinkedList();
//        list.insert(18);
//        list.insert(45);
//        list.insert(12);
//        list.insertAtStart(70);
//        list.insertAt(2, 55);
//        list.insertAt(0, 1);
//        list.deleteAt(2);
//        list.show();

        // Stack
//        Stack stack = new Stack();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(55);
//        stack.show();
//        System.out.println("Stack size: " + stack.size());
//        System.out.println("Stack is empty: " + stack.isEmpty());
//        System.out.println("Peek element: " + stack.peek());
//
//        System.out.println("---------");
//
//        System.out.println("Popped element: " + stack.pop());
//        System.out.println("Popped element: " + stack.pop());
//        System.out.println("Stack size: " + stack.size());
//        System.out.println("Stack is empty: " + stack.isEmpty());
//        System.out.println("Peek element: " + stack.peek());
//        stack.show();

        // Stack
//        DynamicStack dStack = new DynamicStack();
//        dStack.push(10);
//        dStack.show();
//        System.out.println("---------");
//        dStack.push(20);
//        dStack.show();
//        System.out.println("---------");
//        dStack.push(30);
//        dStack.show();
//        System.out.println("---------");
//        dStack.push(40);
//        dStack.show();
//        System.out.println("---------");
//        dStack.push(55);
//        dStack.show();
//        System.out.println("---------");
//        System.out.println("Stack size: " + dStack.size());
//        System.out.println("Stack is empty: " + dStack.isEmpty());
//        System.out.println("Peek element: " + dStack.peek());
//    
//        System.out.println("---------");
//    
//        System.out.println("Popped element: " + dStack.pop());
//        dStack.show();
//        System.out.println("Popped element: " + dStack.pop());
//        dStack.show();
//        System.out.println("Popped element: " + dStack.pop());
//        dStack.show();
//        System.out.println("Popped element: " + dStack.pop());
//        dStack.show();
//        System.out.println("Stack size: " + dStack.size());
//        System.out.println("Stack is empty: " + dStack.isEmpty());
//        System.out.println("Peek element: " + dStack.peek());

        // Queue
        Queue queue = new Queue(5);
        queue.enQueue(5);
        queue.show();
        queue.enQueue(10);
        queue.show();
        queue.enQueue(15);
        queue.show();
        queue.enQueue(20);
        queue.show();
        queue.enQueue(25);
        queue.show();
        queue.enQueue(30);
        queue.deQueue();
        queue.show();
        queue.deQueue();
        queue.show();
        queue.deQueue();
        queue.show();
        queue.enQueue(35);
        queue.show();
        queue.enQueue(40);
        queue.show();
        queue.enQueue(45);
        queue.show();
        queue.enQueue(50);
        System.out.println(queue.getSize());

    }

}
