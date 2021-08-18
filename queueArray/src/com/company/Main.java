package com.company;

public class Main {

    public static void main(String[] args) {
	    QueueArray newQueue = new QueueArray(3);
	    newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
//        newQueue.enQueue(4);
//        boolean result = newQueue.isFull();
//        System.out.println(result);
//        int result1 = newQueue.peek();
//        System.out.println(result1);
//        int result2 = newQueue.peek();
//        System.out.println(result2);
        newQueue.deleteQueue();
    }
}
