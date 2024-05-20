package com.AssignmentKK.Strings;

public class leetcode2108 {
    public static String firstPalindrome(String[] words) {
        boolean flag = false;
        for (int i = 0; i < words.length; i++) {
            flag = isPalindrome(words[i]);
            if (flag) {
                return words[i];
            }
        }
        return "true";
    }

    public static boolean isPalindrome(String word) {
        String rev = "";
//        char ch;
        for (int i = 0; i < word.length(); i++) {
            rev = word.charAt(i) + rev;
        }
//        System.out.println("reverse " + rev);
//        System.out.println("word " + word);
//        System.out.println();
        if (rev.equals(word)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
//        String ans = firstPalindrome(words);
        boolean ans = isPalindrome(words[2]);
        System.out.println(ans);
    }
}
