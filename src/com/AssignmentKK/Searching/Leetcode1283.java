package com.AssignmentKK.Searching;

public class Leetcode1283 {
    public static int sumNums(int[] nums, int div) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) nums[i] / (double) div);
        }
        return sum;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        if (nums.length > threshold)
            return -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)
            max = Math.max(nums[i], max);

        int l = 0, r = max;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (sumNums(nums, mid) <= threshold)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int t = 6;
        int ans = smallestDivisor(nums, t);
        System.out.println(ans);
    }
}
