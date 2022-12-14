/*
349. Intersection of Two Arrays
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */

package com.AssignmentKK.Searching;
import java.util.*;

public class IntersectionTwoArrays {
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

        int[] ans = intersection(num1, num2);
        System.out.print("The intersection of the two array is " + Arrays.toString(ans));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(Integer i : nums1){
            set1.add(i);
        }
        for(Integer i : nums2){
            if(set1.contains(i)){
                intersection.add(i);
            }
        }
        int size = intersection.size();
        int index = 0;
        int[] ans = new int[size];

        for(Integer i : intersection){
            ans[index++] = i;
        }
        return ans;
    }
}
