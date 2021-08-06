package com.company;

public class Main {

    public static void main(String[] args) {
	// Finding the sum of diagonal elements of an array
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int sum1=0;
        int sum2=0;
        for(int i=0; i<mat.length; i++){
            sum1 += mat[i][i];
        }
        for(int i = 0, j = mat.length-1; i < mat.length; i++, j--){
                if(i != j) {
                    System.out.println(mat[i][j]);
                    sum2 += mat[i][j];
                }
        }
        return Math.abs(sum1+sum2);
    }
}
