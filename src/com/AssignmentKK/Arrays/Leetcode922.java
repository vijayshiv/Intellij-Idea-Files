package com.AssignmentKK.Arrays;

import java.util.Arrays;

public class Leetcode922 {
    public static int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int even_index = 0;
        int odd_index = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                ans[even_index] = nums[i];
                even_index += 2;
//                System.out.println("nums - " + nums[i] + " " + even_index);
            } else {
                ans[odd_index] = nums[i];
                odd_index += 2;
//                System.out.println("nums - " + nums[i] + " " + odd_index);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
//        int[] arr = {4, 2, 5, 7};
        int[] arr = {2, 3};
        int[] ans = sortArrayByParityII(arr);
        System.out.println(Arrays.toString(ans));
    }
}
