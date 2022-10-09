package com.AssignmentKK.Arrays;
/*
    Given the array nums, for each nums[i] find out how many numbers
    in the array are smaller than it. That is, for each nums[i]
    you have to count the number of valid j's such that j != i and nums[j] < nums[i].
    Return the answer in an array.
    Input: nums = [8,1,2,2,3]
    Output: [4,0,1,1,3]
    Explanation:
    For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
    For nums[1]=1 does not exist any smaller number than it.
    For nums[2]=2 there exist one smaller number than it (1).
    For nums[3]=2 there exist one smaller number than it (1).
    For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 */
import java.util.*;

public class NumSmallerThanCurrentNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        int[] ans = smallerNumbersThanCurrent(num);
        System.out.println("The number smaller then each number of the array is : " + Arrays.toString(ans));
        int[] val = smallerNumbersThanCurrent2(num);
        System.out.println("The number smaller then each number of the array is : " + Arrays.toString(val));
    }
    //this is the brute force approach of this problem
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int countMax = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    countMax++;
                }
            }
            result[i] = countMax;
        }
        return result;
    }
    //The more optimized way
    public static int[] smallerNumbersThanCurrent2(int[] nums){
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i]){
                max = nums[i];
            }
        }
        // Create buckets for counting sort
        int[] buckets = new int[max + 1];
        // Get frequency of each element
        for (int num : nums) {
            buckets[num]++;
        }
        // Count smaller number than each element
        for (int i = 1; i < buckets.length; i++) {
            buckets[i] += buckets[i - 1];
        }
        // Populate the result
        int[] result = new int[nums.length];
        for(int i = 0; i < result.length; i++){
            if(nums[i] == 0){
                result[i] = 0;
            } else {
                result[i] = buckets[nums[i] - 1];
            }
        }
        return result;
    }
}

