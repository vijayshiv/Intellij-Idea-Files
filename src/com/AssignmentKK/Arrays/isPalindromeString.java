package com.AssignmentKK.Arrays;
import java.util.*;

public class isPalindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = in.nextLine();
//        boolean ans = ;
        System.out.print(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
                ++l;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
                --r;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;
            ++l;
            --r;
        }

        return true;
    }
}
