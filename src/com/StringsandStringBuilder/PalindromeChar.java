package com.StringsandStringBuilder;

import java.util.*;
public class PalindromeChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string -> ");
        String str = in.next();
        if(isPalindrome(str)){
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        if(str == null || str.length() == 0){
            return true;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end) {
                return false;
            }
        }
        return true;
    }
}
