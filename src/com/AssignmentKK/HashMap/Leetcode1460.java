package com.AssignmentKK.HashMap;

import java.util.Arrays;

public class Leetcode1460 {
    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        if (Arrays.equals(target, arr))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {2, 4, 1, 3};
        boolean ans = canBeEqual(arr, arr2);
        System.out.println(ans);
    }
}
