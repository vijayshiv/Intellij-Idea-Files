package com.AssignmentKK.HashMap;

import java.util.Arrays;

public class Leetcode1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        int[] hash = new int[2001];
        boolean ans = false;
        int count = 0;
        for (int val : arr) {
            hash[val + 1000]++;
        }

        for (int i = 0; i < 2001; i++) {
            if (hash[i] != 0) {
                count++;
            }
        }
//        System.out.println(Arrays.stream(hash).distinct().count() - 1);
//        System.out.println(count);
        if ((Arrays.stream(hash).distinct().count() - 1) == count)
            return true;

        return false;

    }

    public static void main(String[] args) {
//        int[] arr = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        int[] arr = {1, 2, 2, 1, 1, 3};
        boolean ans = uniqueOccurrences(arr);

        System.out.println(ans);


    }
}
