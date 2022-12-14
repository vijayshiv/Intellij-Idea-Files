/*
350. Intersection of Two Arrays II
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */
package com.AssignmentKK.Searching;
import java.util.*;

public class IntersectionTwoArraySecond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of first array -> ");
        int n = in.nextInt();
        System.out.print("Enter the length of second array -> ");
        int m = in.nextInt();

        System.out.print("Enter the elements of fisrt array -> ");
        int[] num1 = new int[n];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = in.nextInt();
        }

        System.out.print("Enter the elements of fisrt array -> ");
        int[] num2 = new int[m];
        for (int i = 0; i < num2.length; i++) {
            num2[i] = in.nextInt();
        }

        int[] ans = intersect(num1, num2);
        System.out.print("The intersection of the two array is " + Arrays.toString(ans));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length * nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while( i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            } else if(nums1[i] > nums2[j]){
                j++;
            } else{
                ans[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(ans, 0, k);
    }
}
