package com.AssignmentKK.Strings;

public class Leetcode345 {
    public static String reverseVowels(String s) {
        char[] letter = s.toCharArray();
        String vowel = "aeiouAEIOU";

        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            while (start < end && vowel.indexOf(letter[start]) == -1) {
                start++;
            }

            while (start < end && vowel.indexOf(letter[end]) == -1) {
                end--;
            }

            char temp = letter[start];
            letter[start] = letter[end];
            letter[end] = temp;

            start++;
            end--;
        }
        return new String(letter);
    }

    public static void main(String[] args) {
        String s = "Authentication";
        // oithanticetuan
        String ans = reverseVowels(s);
        System.out.println(ans);
    }
}
