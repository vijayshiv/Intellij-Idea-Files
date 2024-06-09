package com.AssignmentKK.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Leetcode974 {

    public static int subarraysDivByK(int[] nums, int k) {
        // optimized with prefix sum
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int rem = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            rem = sum % k;

            if (rem < 0) {
                rem += k;
            }

            if (map.containsKey(rem)) {
                ans += map.get(rem);
                map.put(rem, map.get(rem) + 1);
            } else
                map.put(rem, 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 0, -2, -3, 1};
        int k = 5;
        int ans = subarraysDivByK(arr, k);
        System.out.println(ans);
    }
}
/*
brute force
int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum % 5 == 0) {
                    count++;
                }
            }
        }
        return count;
*/