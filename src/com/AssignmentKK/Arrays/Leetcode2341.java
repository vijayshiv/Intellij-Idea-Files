package com.AssignmentKK.Arrays;

import java.util.Arrays;

public class Leetcode2341 {
    public static int[] numberOfPairs(int[] nums) {
        if(nums.length == 1){
            return new int[]{0, 1};
        }
        int[] temp = new int[101];
        int[] result = new int[2];
        int pairs = 0, left = 0;

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 0) {
                pairs = pairs + (temp[i] / 2);
                left = left + (temp[i] % 2) ;
            }
        }
        return new int[]{pairs, left};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] ans = numberOfPairs(nums);
        System.out.println(Arrays.toString(ans));
    }
}
