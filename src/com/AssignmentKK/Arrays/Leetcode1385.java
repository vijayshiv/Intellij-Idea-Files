package com.AssignmentKK.Arrays;

public class Leetcode1385 {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            int a1 = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    count++;
                    break;
                }
            }
            ans++;
        }
        System.out.println(ans + " " + count);
        return ans - count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 2, 3};
        int[] arr2 = {-4, -3, 6, 10, 20, 30};
        int d = 3;
        int ans = findTheDistanceValue(arr1, arr2, d);
        System.out.println(ans);
    }
}
