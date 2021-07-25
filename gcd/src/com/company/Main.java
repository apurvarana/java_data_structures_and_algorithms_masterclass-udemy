package com.company;

public class Main {

    public static void main(String[] args) {
	int div = gcd(8,12);
        System.out.println(div);
    }
    //Solving using Euclidean Algorithm
    public static int gcd(int a, int b){
        if (a < 0 || b < 0){
            return -1;
        }
        if (b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}
