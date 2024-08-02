package com.AssignmentKK.Strings;

public class Leetcode944 {

    public static int minDeletionSize(String[] strs) {
        int count = 0;
        int m = strs.length;
        int n = strs[0].length();
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                if (strs[i - 1].charAt(j) > strs[i].charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        String[] a = {"cba", "daf", "ghi"};
//        String[] a = {"zyx", "wvu", "tsr"};
        String[] a = {"rrjk", "furt", "guzm"};
        int ans = minDeletionSize(a);
        System.out.println(ans);
    }
}
