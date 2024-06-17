package com.AssignmentKK.HashMap;

public class Leetcode1991 {
    public static int findMiddleIndex(int[] nums) {
        int left = 0, sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];

        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (left == sum)
                return i;

            left += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -1, 8, 4};
        int ans = findMiddleIndex(arr);
        System.out.println(ans);
    }
}
