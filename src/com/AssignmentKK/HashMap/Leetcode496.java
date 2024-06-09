package com.AssignmentKK.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Leetcode496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 from the end to the beginning
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                map.put(num, stack.peek());
            } else {
                map.put(num, -1);
            }
            stack.push(num);
        }


        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
//        int[] n1 = {4, 1, 2};
        int[] n1 = {1, 3, 5, 2, 4};
//        int[] n2 = {1, 3, 4, 2};
        int[] n2 = {6, 5, 4, 3, 2, 1, 7};
        int[] ans = nextGreaterElement(n1, n2);
        System.out.println(Arrays.toString(ans));
    }
}
