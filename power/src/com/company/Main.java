package com.company;

public class Main {

    public static void main(String[] args) {
        int result = power(2,2);
        System.out.println(result);
    }
    public static int power(int base, int exp){
        if (exp == 0){
            return 1;
        }
        if (exp < 0){
            return -1;
        }
        return base * power(base, exp-1);
    }
}
