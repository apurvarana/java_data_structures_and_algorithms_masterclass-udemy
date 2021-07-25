package com.company;

public class Main {

    public static void main(String[] args) {
	    Main main = new Main();
	    var result = main.decimalToBinary(13);
        System.out.println(result);
    }
    public static int decimalToBinary(int n){
        if (n < 0){
            return -1;
        }
        if (n == 0){
            return 0;
        }
        return n%2 + decimalToBinary(n/2) * 10;
    }
}
