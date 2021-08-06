package com.company;

public class Main {

    public static void main(String[] args) {
        //You are given two integer arrays. Write a program to check if they are permutation of each other
	    Main main = new Main();
	    int[] array1 = {1,2,3,4,5};
	    int[] array2 = {5,1,2,3,4};
        System.out.println(main.permutation(array1, array2));
    }
    public boolean permutation(int[] array1, int[] array2){
        int sum1 = 0;
        int sum2 = 0;
        int product1 = 0;
        int product2 = 0;
        if(array1.length != array2.length){
            return false;
        }
        for(int i=0; i< array2.length; i++){
            sum1 += array1[i];
            sum2 += array2[i];
            product1 *= array1[i];
            product2 *= array2[i];
            if((sum1 == sum2) && (product1 == product2)){
                return true;
            }
        }
        return false;
    }
}
