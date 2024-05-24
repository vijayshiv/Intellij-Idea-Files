package com.AssignmentKK.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode2089 {
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 3};
        int target = 2;


        List<Integer> ans = targetIndices(arr, target);

        ans.stream().forEach((e) -> System.out.println(e));
    }
}
