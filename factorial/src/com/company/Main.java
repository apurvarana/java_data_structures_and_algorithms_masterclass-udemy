package com.company;

public class Main {

    public static void main(String[] args) {
	    int ans = factorial(4);
        System.out.println(ans);
    }
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        if (num < 0){
            return -1;
        }
        return num * factorial(num-1);
    }
}
