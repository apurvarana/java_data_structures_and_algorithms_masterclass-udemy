package com.company;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The queue has been created with size " + size);
    }
    //isFull
    public boolean isFull(){
        if (topOfQueue == arr.length-1){
            return true;
        }else{
            return false;
        }
    }

    //isEmpty
    public boolean isEmpty(){
        if ((beginningOfQueue == -1)|| (beginningOfQueue == arr.length)){
            return true;
        }else{
            return false;
        }
    }
    public void enQueue(int value){
        if(isFull()){
            System.out.println("The Queue is full!");
        }else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted value " + value + " in the queue");
        }else{
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted value " + value + " in the queue");
        }
    }
    //deQueue
    public int deQueue(){
        if (isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }else{
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue>topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }
    //peek
    public int peek(){
        if (!isEmpty()){
            return arr[beginningOfQueue];
        }else{
            System.out.println("The queue is empty");
            return -1;
        }
    }
    //delete
    public void deleteQueue(){
        arr = null;
        System.out.println("The queue is successfully deleted");
    }
}
