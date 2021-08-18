package com.company;

public class Main {

    public static void main(String[] args) {
	    CircularQueue newCQ = new CircularQueue(3);
	    newCQ.enQueue(10);
        newCQ.enQueue(20);
        newCQ.enQueue(30);
//        newCQ.enQueue(40);
//        int result1 = newCQ.peek();
//        System.out.println(result1);
//        int result2 = newCQ.peek();
//        System.out.println(result2);
//	    boolean result = newCQ.isEmpty();
//        System.out.println(result);
        newCQ.deleteQueue();
    }
}
