package com.AssignmentKK.Strings;

import java.util.Arrays;

public class Leetcode821 {
    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int cpos = -n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c)
                cpos = i;
            ans[i] = i - cpos;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c)
                cpos = i;
            ans[i] = Math.min(ans[i], Math.abs(i - cpos));
        }

        return ans;
    }

    public static void main(String[] args) {
//        String s = "loveleetcode";
//        char c = 'e';

        String s = "aaab";
        char c = 'b';
        int[] ans = shortestToChar(s, c);
        System.out.println(Arrays.toString(ans));
    }
}



