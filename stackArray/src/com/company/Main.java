package com.company;

public class Main {

    public static void main(String[] args) {
        Stack newStack = new Stack(4);
//        boolean result = newStack.isFull();
//        System.out.println(result);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
//        int pop = newStack.pop();
//        System.out.println(pop);
//        int pop2 = newStack.pop();
//        System.out.println(pop2);
//        int peek = newStack.peek();
//        System.out.println(peek);
//        int peek2 = newStack.peek();
//        System.out.println(peek2);
        newStack.deleteStack();
    }
}
