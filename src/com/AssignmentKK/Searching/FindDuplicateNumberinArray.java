/*
287. Find the Duplicate Number
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
 */
package com.AssignmentKK.Searching;
import java.util.*;

public class FindDuplicateNumberinArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of first array -> ");
        int n = in.nextInt();
        System.out.print("Enter the elements of array -> ");
        int[] num1 = new int[n];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = in.nextInt();
        }
        int ans = findDuplicate(num1);
        System.out.print("The duplicate number in the array is -> " + ans);
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                int tmp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = tmp;
            }else{
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return nums[index];
            }
        }

        return nums.length;
    }
}
