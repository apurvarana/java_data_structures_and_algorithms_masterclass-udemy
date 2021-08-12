package com.company;

public class Main {

    public static void main(String[] args) {
	    CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
	    csll.createCSLL(5);
	    csll.insertCSLL(4,0);
        csll.insertCSLL(6,1);
        csll.insertCSLL(7,8);
        csll.traverseCSLL();
        csll.deleteCSLL();
        csll.traverseCSLL();

//        System.out.println(csll.head.value);
//        System.out.println(csll.head.next.value);
    }
}
