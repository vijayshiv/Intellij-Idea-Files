package com.AssignmentKK.Arrays;

public class Leetcode696 {
    public static int countBinarySubstrings(String s) {
        int curr = 1;
        int prev = 0;
        int ans = 0;

        for (int i = 1; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i - 1);
            if (c1 == c2)
                curr++;
            else {
                ans += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        }
        ans += Math.min(curr, prev);
        return ans;
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = "00110011";
        String test2 = "10101";
        String test3 = "000111";

        int ans = countBinarySubstrings(test2);

    }
}
