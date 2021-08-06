package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Write a function called middle that takes a list and returns a new list that contains all but the first and last elements
        int[] myArray = {1,2,3,4};
        int[] result = middle(myArray);
        System.out.println(Arrays.toString(result));
    }
    static int[] middle(int[] arr) {
        int[] newArray;
        newArray = new int[arr.length - 2];
        for(int i=0; i< newArray.length; i++){
            newArray[i] = arr[i+1];
        }
        return newArray;
    }
}
