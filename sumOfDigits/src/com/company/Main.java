package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        var result = main.sumOfDigits(-23);
        System.out.println(result);
    }

    public int sumOfDigits(int number){
        if (number < 0){
            return -1;
        }
        if (number == 0){
            return 0;
        }
            return number%10 + sumOfDigits(number/10);
    }
}
