package com.company;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value =  nodeValue;
        if(head == null){
            createSinglyLinkedList(nodeValue);
            return;
        }else if(location == 0){
            node.next = head;
            head = node;
        }else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }else{
            Node tempNode = head;
            int i = 0;
            while(i < location-1){
                tempNode = tempNode.next;
                i++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traverseSinglyLinkedList(){
        if (head == null){
            System.out.println("SLL does not exist");
        }else {
            Node tempNode = head;
            for(int i=0; i< size; i++){
                System.out.println(tempNode.value);
                if(i != size-1){
                    System.out.println("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    boolean searchNode(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for (int i=0; i<size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Found the node at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found! ");
        return false;
    }
    public void deletionOfNode(int location){
        if (head == null){
            System.out.println("The SLL does not exist");
            return;
        }else if(location == 0){
            head = head.next;
            size--;
            if (size == 0){
                tail = null;
            }
        }else if(location>=size){
            Node tempNode = head;
            for(int i=0; i<size-1; i++){
                tempNode = tempNode.next;
            }
            if(tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
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

    public void deleteSLL(){
        head = null;
        tail = null;
        System.out.println("The SLL deleted successfully");
    }
}
