package com.AssignmentKK.HashMap;

import java.util.*;

public class leetcode3005 {
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer ele : nums) {
            if (map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
            } else {
                map.put(ele, 1);
            }
        }

        Collection<Integer> val = map.values();
        int count = 0;
        for (Integer e : val) {
            if (count < e)
                count = e;
        }
        int ans = 0;
        for (Integer e : val) {
            if (count == e) {
                ans++;
            }
        }
        return ans * count;
    }

    public static void main(String[] args) {
        int[] num = {10,12,11,9,6,19,11};
        int result = maxFrequencyElements(num);
        System.out.println("The maximum frequency of elements is: " + result);
    }
}

