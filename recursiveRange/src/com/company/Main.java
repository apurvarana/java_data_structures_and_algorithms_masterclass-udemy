package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(recursiveRange(6));
        System.out.println(recursiveRange(10));
    }
    public static int recursiveRange(int num){
        if (num == 0){
            return 0;
        }
        return recursiveRange(num-1) + num;
    }
}
