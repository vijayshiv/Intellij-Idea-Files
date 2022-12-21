// https://www.youtube.com/watch?v=MjpAAE3-hYg
/*
1802. Maximum Value at a Given Index in a Bounded Array
You are given three positive integers: n, index, and maxSum. You want to construct an array nums (0-indexed)
that satisfies the following conditions:
nums.length == n
nums[i] is a positive integer where 0 <= i < n.
abs(nums[i] - nums[i+1]) <= 1 where 0 <= i < n-1.
The sum of all the elements of nums does not exceed maxSum.
nums[index] is maximized.
Return nums[index] of the constructed array.

Note that abs(x) equals x if x >= 0, and -x otherwise.

Example 1:
Input: n = 4, index = 2,  maxSum = 6
Output: 2
Explanation: nums = [1,2,2,1] is one array that satisfies all the conditions.
There are no arrays that satisfy all the conditions and have nums[2] == 3, so 2 is the maximum nums[2].

Example 2:
Input: n = 6, index = 1,  maxSum = 10
Output: 3
 */
package com.AssignmentKK.Searching;
import java.util.*;
public class MaxArrayGivenBoundary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array -> ");
        int n = in.nextInt();
        System.out.print("Enter the index -> " );
        int index = in.nextInt();
        System.out.print("Enter the maximum sum of the array -> ");
        int maxSum = in.nextInt();

        int ans = maxValue(n, index, maxSum);
        System.out.print("The number of arrays we can form are -> " + ans);
    }
    public static int maxValue(int n, int index, int maxSum) {
        int low = 1, high = maxSum;
        while (low < high) {
            long mid = (high - low + 1) / 2 + low;
            long sumLeft = ((mid - index) + (mid - 1)) * index / 2;
            if (mid <= index)
                sumLeft = (mid - 1) * mid / 2 + index - mid + 1;
            sumLeft = Math.max(sumLeft, index);
            long sumRight = ((mid - 1) + (mid - (n - 1 - index))) * (n - index - 1) / 2;
            if (mid <= n - 1 - index)
                sumRight = (mid - 1) * mid / 2 + (n - 1 - index - mid) + 1;
            sumRight = Math.max(sumRight, n - index - 1);
            long sum = sumLeft + sumRight + mid;
            if (sum > maxSum)
                high = (int) mid - 1;
            else
                low = (int) mid;
        }
        return low;
    }
}
