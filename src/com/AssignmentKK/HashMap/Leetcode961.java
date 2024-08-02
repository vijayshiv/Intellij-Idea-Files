package com.AssignmentKK.HashMap;

import java.util.Arrays;

public class Leetcode961 {
    public static int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        int[] hash = new int[10000];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        int ans = repeatedNTimes(nums);
        System.out.println(ans);
    }
}