package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome("awesome"));
        System.out.println(isPalindrome("tacocat"));

    }
    public static boolean isPalindrome(String s){
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1, s.length()-1));
        return false;
    }
}
