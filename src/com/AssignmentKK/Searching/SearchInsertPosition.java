/*
35. Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
 */
package com.AssignmentKK.Searching;
import java.util.*;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array -> ");
        int n = in.nextInt();
        System.out.print("Enter the number in sorted form -> ");
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        System.out.print("Enter the target number -> ");
        int target = in.nextInt();

        int ans = searchInsert(num,target);
        System.out.print("The index at which the number or should be inserted is -> " + ans);
    }
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high= mid -1;
            }else{
                low = mid+1;
            }
        }

        return low;
    }
}
