package com.AssignmentKK.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        // Dummy values for nums1 and nums2
        int[] nums1 = {1,2,3,0,0,0}; // The extra 0s are placeholders for nums2 elements
        int[] nums2 = {2,5,6};
        int m = 3; // Number of initialized elements in nums1
        int n = 3; // Number of initialized elements in nums2

        // Print arrays before merging
        System.out.println("Before merging:");
        System.out.println("nums1: " + java.util.Arrays.toString(nums1));
        System.out.println("nums2: " + java.util.Arrays.toString(nums2));

        // Call the merge function
        merge(nums1, m, nums2, n);

        // Print arrays after merging
        System.out.println("After merging:");
        System.out.println("nums1: " + java.util.Arrays.toString(nums1));
        System.out.println("nums2: " + java.util.Arrays.toString(nums2));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = 0;
        while (left >= 0 && right < n) {
            if (nums1[left] > nums2[right]) {
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        int len1 = nums1.length-1;
        int len2 = nums2.length-1;
        while(len1 > m-1){
            nums1[len1] = nums2[len2];
            len1--;
            len2--;
        }
    }
}
