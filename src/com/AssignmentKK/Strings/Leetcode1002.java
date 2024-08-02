package com.AssignmentKK.Strings;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1002 {
    public static List<String> commonChars(String[] words) {
        int[][] occ = new int[words.length][26];
        for (int i = 0; i < occ.length; i++)
            for (char c : words[i].toCharArray())
                occ[i][c - 'a']++;

        List<String> res = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            int max = Integer.MAX_VALUE;
            for (int j = 0; j < occ.length; j++)
                max = Math.min(max, occ[j][i - 'a']);

            for (int j = 0; j < max; j++)
                res.add(String.valueOf((char) i));
        }

        return res;
    }

    public static void main(String[] args) {
        String[] w = {"bella", "label", "roller"};
        List<String> ans = commonChars(w);
        System.out.println(ans.toString());
    }
}
