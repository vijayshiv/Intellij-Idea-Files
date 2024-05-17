package com.AssignmentKK.HashMap;

import java.util.HashSet;
import java.util.Set;

public class leetcode2441 {
    public static int findMaxK(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == -nums[j]){
                    ans.add(nums[i]);
                }
            }
        }

        if(ans.isEmpty())
            return -1;
        int max = 0;
        for(Integer e : ans) {
            if (max < e) {
                max = e;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] num = {-1,2,-3,3};
        int result = findMaxK(num);
        System.out.println("The maximum of elements is: " + result);
    }
}
