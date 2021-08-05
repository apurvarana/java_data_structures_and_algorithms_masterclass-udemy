package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        int[] arr = {1,5,4,5};
        System.out.println(main.maxProduct(arr));
    }
    public String maxProduct(int[] intArray){
        String str = "";
         int maxProduct = Integer.MIN_VALUE;
         for (int i=0; i<intArray.length; i++){
             for(int j=0; j< intArray.length; j++) {
                 if (i != j) {
                     if (((intArray[i]-1) * (intArray[j]-1) > maxProduct)) {
                         maxProduct = (intArray[i] - 1) * (intArray[j] - 1);
                        str = Integer.toString(intArray[i])+","+Integer.toString(intArray[j]);
                     }
                 }
             }
         }
         return str;
    }
}
