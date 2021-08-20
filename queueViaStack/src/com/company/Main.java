package com.company;

public class Main {

    public static void main(String[] args) {
	    QueueViaStack newQueue = new QueueViaStack();
	    newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        System.out.println(newQueue.deQueue());
    }
}
