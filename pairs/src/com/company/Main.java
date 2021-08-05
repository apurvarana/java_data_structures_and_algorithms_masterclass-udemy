package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Main main = new Main();
	    int[] intArray = {2,7,11,15};
        int[] result= main.twoSum(intArray,9);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target){
        int temp = 0;
        for(int i=0; i<nums.length; i++){
            temp = Math.abs(nums[i] - target);
            for (int j=0; j<nums.length; j++){
                if (temp == nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{Integer.MIN_VALUE,Integer.MIN_VALUE};
    }
}
