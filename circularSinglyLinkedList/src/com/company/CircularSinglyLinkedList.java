package com.company;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;

    }
    public void insertCSLL(int nodeValue, int location){
        Node newNode = new Node();
        newNode.value = nodeValue;
        if(head == null){
            createCSLL(nodeValue);
            return;
        }else if(location == 0){
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }else if(location >= size){
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }else{
            Node tempNode = head;
            int index = 0;
            while(index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
        size++;
    }

    public void traverseCSLL(){
        if(head != null){
            Node tempNode = head;
            for(int i=0; i<size; i++){
                System.out.println(tempNode.value);
                if(i != size-1){
                    System.out.println("->");
                }
                tempNode = tempNode.next;
            }
        }else{
            System.out.println("CSLL doesn't exist");
        }
    }
    public boolean searchNode(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for(int i=0; i<size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Found node at location " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }
    public void deleteNode(int location){
        if(head == null){
            System.out.println("the CSLL does not exist!");
            return;
        }else if( location == 0){
            head = head.next;
            tail.next = head;
            size--;
            if(size == 0){
                tail = null;
                head.next = null;
                head = null;
            }
        }else if(location >= size){
           Node tempNode = head;
           for(int i=0; i<size-1; i++){
               tempNode = tempNode.next;
           }
           if(tempNode == head){
               head.next = null;
               tail = head = null;
               size--;
               return;
           }
           tempNode.next = head;
           tail = tempNode;
           size--;
        }else{
            Node tempNode = head;
            for(int i=0; i<location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
    public void deleteCSLL(){
        if(head == null){
            System.out.println("The CSLL does not exist");
        }else{
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The CSLL is successfully deleted");
        }
    }

}
