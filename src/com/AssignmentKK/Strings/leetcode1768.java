package com.AssignmentKK.Strings;

public class leetcode1768 {
    public static void main(String[] args) {
        String w1 = "abc";
        String w2 = "ps";

        String str = "";
        for (int i = 0; i < 10; i++) {
            if (w1.charAt(i) != '\0') {
                str = str + w1.charAt(i);
            }
            if (w2.charAt(i) != '\0') {
                str = str + w2.charAt(i);
            }
        }
        System.out.println(str);
    }
}
