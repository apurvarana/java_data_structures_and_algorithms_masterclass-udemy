package com.company;

public class Main {
//Find missing number in an integer array of 1 to 10
    public static void main(String[] args) {
	int[] intArray = {1,2,3,4,5,6,8,9,10};
	int sum = 0;
	for(int i=0; i<intArray.length; i++){
	    sum += intArray[i];
    }
	if(sum < 55){
        System.out.println("Missing number is: " + (55-sum));
    }else{
        System.out.println("No missing number");
    }
    }
}
