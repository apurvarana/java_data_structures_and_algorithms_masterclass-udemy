package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(fib(4));
        System.out.println(fib(10));
    }
    public static int fib(int n){
        if (n==0 || n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
