/*
https://www.youtube.com/watch?v=ym1SvsPnDy8
540. Single Element in a Sorted Array
You are given a sorted array consisting of only integers where every element appears exactly twice,
except for one element which appears exactly once.
Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.

Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

Example 2:
Input: nums = [3,3,7,7,10,11,11]
Output: 10
 */
package com.AssignmentKK.Searching;
import java.util.*;

public class SingleElementSortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array -> ");
        int n = in.nextInt();
        System.out.print("Enter the number in array -> ");
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        int ans = singleNonDuplicate(num);
        System.out.print("The single element in this array is -> " + ans);
    }
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int lo = 0;
        int hi = n-1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if ((mid % 2 == 0 && mid + 1 < n  && nums[mid] == nums[mid + 1]) ||
                    (mid % 2 == 1 && mid - 1 >= 0 && nums[mid] == nums[mid - 1])) {

                lo = mid + 1;
            } else {
                hi = mid;
            }
            if(mid-1 >= 0 && mid+1 <n && nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]){
                return nums[mid];
            }
        }
        return nums[lo];
    }
}
