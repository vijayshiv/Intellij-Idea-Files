package com.AssignmentKK.Arrays;
/*
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the length of the array -> ");
        int n = in.nextInt();
        System.out.print("Input the elements in the array -> ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Input the target element -> ");
        int t = in.nextInt();
        int[] ans = twoSum(arr,t);
        System.out.print("The elements that has the required sum is -> " + Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length - 1 ; i++)
            for(int j = i + 1 ; j < nums.length ; j++)
            {
                if(nums[i] + nums[j] == target)
                    return new int[]{i ,j};
            }
        return new int[]{-1 , -1};
    }
}
