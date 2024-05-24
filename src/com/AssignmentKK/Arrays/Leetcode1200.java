package com.AssignmentKK.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1200 {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
                // we need to clear if the values in the start are not the minimum difference then
                // they are also added to remove those we need to remove them and add only the minimum one
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (diff == min) {
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] arr = {4, 2, 1, 3};
//        int[] arr = {1, 3, 6, 10, 15};
//        int[] arr = {3, 8, -10, 23, 19, -4, -14, 27};
        int[] arr = {40, 11, 26, 27, -20};
        List<List<Integer>> ans = minimumAbsDifference(arr);
        for (List<Integer> e : ans) {
            System.out.println(e);
        }
    }
}
