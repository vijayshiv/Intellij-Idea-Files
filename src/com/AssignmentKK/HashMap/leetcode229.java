package com.AssignmentKK.HashMap;

import java.util.*;

public class leetcode229 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        int min = (int) (n / 3);
        for (int i = 0; i < n; i++) {
            int val = map.getOrDefault(nums[i], 0);
            map.put(nums[i], val + 1);

            if (map.get(nums[i]) == min)
                ans.add(nums[i]);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 6, 6, 6, 6, 7, 2, 3, 3, 3, 7, 1, 2, 3, 3, 5};
//        int[] arr = {1,1,1,3,2,2,2};
        List<Integer> res = new ArrayList<>();
        res = majorityElement(arr);
        for (Integer ele : res) {
            System.out.println(ele);
        }
//        System.out.println(Arrays.toString(res.toArray()));
    }

}
