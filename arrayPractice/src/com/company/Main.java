package com.company;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    //Step 1- Declare
//        int[][] int2DArray;
//        //Step 2 - Instantiate
//        int2DArray = new int[2][2];
//        //Step 3 - Initiate
//        int2DArray[0][0] = 1;
//        int2DArray[0][1] = 2;
//        int2DArray[1][0] = 3;
//        int2DArray[1][1] = 4;
//
//        System.out.println(Arrays.deepToString(int2DArray));
//
//        String s2DArray[][] = {{"a","b"},{"c","d"}};
//        System.out.println(Arrays.deepToString(s2DArray));
        TwoDimensionalArray sda = new TwoDimensionalArray(3,3);
        sda.insertValueInArray(0,0,10);
        sda.insertValueInArray(0,1,20);
        sda.insertValueInArray(1,0,30);
        sda.insertValueInArray(2,0,40);
//        sda.searchingValue(20);
//        sda.searchingValue(50);
        //sda.traverse2DArray();
        //sda.accessCell(0,1);
        System.out.println(Arrays.deepToString(sda.arr));
        sda.deleteFromArray(0,0);
        System.out.println(Arrays.deepToString(sda.arr));

    }
}
