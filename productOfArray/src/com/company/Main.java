package com.company;

public class Main {

    public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5};
        System.out.println(productOfArray(arr,arr.length));
    }
    public static int productOfArray(int A[], int N){
       if (N <= 0){
           return 1;
       }

        return (productOfArray(A,N-1) * A[N-1]);
    }
}
