package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(first("appmillerS"));
    }
    public static char first(String str){
        if (str.charAt(0)<65 || str.charAt(0)>90){
            return first(str.substring(1));

        }
        return str.charAt(0);
    }
}
