package com.company;

import java.sql.Array;

public class TwoDimensionalArray {
    int arr[][] = null;

    public TwoDimensionalArray(int numOfRows, int numOfColumns) {
        this.arr = new int[numOfRows][numOfColumns];
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }
    public void insertValueInArray(int row, int col, int value){
        try{
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("Value is successfully inserted");
            }else {
                System.out.println("This cell is already occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }
    public void accessCell(int row, int col){
        System.out.println("Accessng row" + row + ", col" + col);
        try{
            System.out.println("Cell value is: " + arr[row][col]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }
    public void traverse2DArray(){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[0].length; col++){
                System.out.println(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    public void searchingValue(int value){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[0].length; col++){
                if(arr[row][col] == value){
                    System.out.println("The array contains " + value);
                    return;
                }
            }
        }
        System.out.println("Value not found");
    }
    public void deleteFromArray(int row, int col){
        try{
            System.out.println("Successfully deleted " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }
}
