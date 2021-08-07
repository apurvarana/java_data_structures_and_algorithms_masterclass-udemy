package com.company;

public class Main {
    //Given an array, write a function to get first, second best scores from the array
    //Array may contain duplicates

    public static void main(String[] args) {
	Integer[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(firstSecond(myArray));
    }
    static String firstSecond(Integer[] myArray) {
        int first = 0;
        int second = 0;
        for(int i=0; i<myArray.length; i++){
            if(myArray[i] > first){
                first = myArray[i];
            }
        }
        for(int i=0; i<myArray.length; i++){
            if((myArray[i] > second) && myArray[i] != first){
                second = myArray[i];
            }
        }
        return first + " " + second;
    }
}
