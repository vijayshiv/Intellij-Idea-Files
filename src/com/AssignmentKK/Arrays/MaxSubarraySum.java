package com.AssignmentKK.Arrays;
/*
    Given an integer array nums, find the contiguous subarray (containing at least one number)
    which has the largest sum and return its sum.
    A subarray is a contiguous part of an array.
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
 */
import java.util.*;
public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the length of the array -> ");
        int n = in.nextInt();
        System.out.print("Input the elements in the array -> ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int ans = maxSubArray(arr);
        System.out.print("The maxSubarray sum is = " + ans);
    }
    public static int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (currSum + nums[i] < nums[i]) {
                currSum = nums[i];
            } else {
                currSum += nums[i];
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
/*
    Explanation
    If all the elements in the array are negative numbers, then, the sum of the subarray will be maximum
    when it contains only the least magnitude number (the smallest negative number) as adding any other
    element, will just be adding more negative quantity to it thereby making it less.

    Case 2: At least one non-negative number in Array:
    1. For such cases, we can initialize the max value to be returned to the first element of the original
    array, here we will be dealing with the original i.e. the unsorted array as we need to maintain the
    original order of the elements as the problem involves the concept of subarrays.

    2.Now make use of a loop till the last element of the array and keep adding the current element
    onto the sum value.

    3. If the sum value is less than 0, then initialise the sum to 0 and move ahead in the array as
    adding this element will only decrement the sum, so we need to ignore this element.

    4. If this value is greater than the max value, then update the max value to this sum
    and keep repeating this task.

    5. By doing this, the sum variable will contain the current max value of the subarray under
    consideration and the max variable will contain the overall maximum sum of the subarray till
    the current element.

    6. This max variable will store the value to be returned as the final answer of our code
 */
