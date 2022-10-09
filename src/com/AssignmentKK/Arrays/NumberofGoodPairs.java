package com.AssignmentKK.Arrays;
/*
    Given an array of integers nums, return the number of good pairs.
    A pair (i, j) is called good if nums[i] == nums[j] and i < j.
    Input: nums = [1,2,3,1,1,3]
    Output: 4
    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */
import java.util.Arrays;
import java.util.Scanner;

public class NumberofGoodPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        int ans = numIdenticalPairs(num);
        System.out.println("The running sum array is : " + ans);
    }
    public static int numIdenticalPairs(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    res++;
                }
            }
        }
        return res;
    }
}
