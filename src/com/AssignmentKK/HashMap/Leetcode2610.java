package com.AssignmentKK.HashMap;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Leetcode2610 {

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int i, k = 0;
        int[] hashArr = new int[201];
        for (int m = 0; m < nums.length; m++)
            hashArr[nums[m]]++;

        while (k <= nums.length) {
            List<Integer> innerList = new ArrayList<>();

            k++;
            System.out.println("K - " + k);
            for (i = 1; i < hashArr.length; i++) {
                if (hashArr[i] != 0) {
                    innerList.add(i);
                    hashArr[i]--;
                }
            }
            if (innerList.size() > 0)
                ans.add(innerList);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 1, 2, 3, 1};
//        int[] arr = {1, 2, 3, 4};
//        int[] arr = {1, 2, 2, 2, 1};
        List<List<Integer>> l = findMatrix(arr);
        for (List<Integer> e : l) {
            System.out.println(e);
        }
    }
}

// k is used to iterate for max number of length
// [ 1,2,2,2,1] -> {[1,2], [1,2], [2]}
// 2 -> 3 times so to make it zero it need to iterate 3 times
// 1 -> 2 times so to make it zero it need to iterate 2 times
// so k = (5) which is nums.length

//  if (innerList.size() > 0)
//    ans.add(innerList);
// the above condition is for empty array as the k is running 5 times but it doesn't mean that we have 5 distinct elements for
// each inner array so we check if the size of inner array is zero then we do not add it in the outer array
