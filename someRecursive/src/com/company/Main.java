package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean someRecursive(int[] arr, OddFunction odd){
        if(arr.length==0){
            return false;
        }
        if(odd.run(arr[0]) == false){
            return someRecursive(Arrays.copyOfRange(arr,1,arr.length), odd);
        }
        else{
            return true;
        }
    }
}
