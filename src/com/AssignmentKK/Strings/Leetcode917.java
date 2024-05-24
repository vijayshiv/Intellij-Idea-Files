package com.AssignmentKK.Strings;

public class Leetcode917 {
    public static String reverseOnlyLetters(String s) {
        String ss = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
                ss += s.charAt(i);
        }
        String ssn = "";
        for (int i = 0; i < ss.length(); i++) {
            ssn = ss.charAt(i) + ssn;
        }

        StringBuilder ans = new StringBuilder(s);
        for (int i = 0, j = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                ans.setCharAt(i, ssn.charAt(j++));
                continue;
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
//        String s = "a-bC-dEf-ghIj";
        String s = "Test1ng-Leet=code-Q!";
        String res = reverseOnlyLetters(s);
        System.out.println(res);
    }
}
