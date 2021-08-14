package com.company;

public class Main {

    public static void main(String[] args) {
	    CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
	    cdll.createCDLL(1);
	    cdll.insertNode(2,1);
        cdll.insertNode(3,2);
        cdll.insertNode(4,3);
//        cdll.searchNode(3);
//        cdll.searchNode(5);
//        cdll.deleteNode(1);
        cdll.traverseCDLL();
        cdll.deleteCDLL();
        cdll.traverseCDLL();
//        cdll.reverseTraverseCDLL();
    }
}
