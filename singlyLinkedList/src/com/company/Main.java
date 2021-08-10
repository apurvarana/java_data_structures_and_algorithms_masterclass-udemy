package com.company;

public class Main {

    public static void main(String[] args) {
	    singlyLinkedList sll = new singlyLinkedList();
	    sll.createSinglyLinkedList(5);
        //System.out.println(sll.head.value);
        sll.insertInLinkedList(6,1);
        //System.out.println(sll.head.next.value);
        sll.insertInLinkedList(7,2);
        sll.insertInLinkedList(8,3);
        sll.insertInLinkedList(9,4);
        sll.traverseSinglyLinkedList();
        sll.deleteSLL();
        sll.traverseSinglyLinkedList();
    }
}
