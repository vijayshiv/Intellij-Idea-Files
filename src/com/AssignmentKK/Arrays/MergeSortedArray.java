package com.AssignmentKK.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the 1st array : ");
        int n = in.nextInt();
        int[] nums1 = new int[n];
        System.out.print("Enter the elements in the 1st array : ");
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = in.nextInt();
        }

        System.out.print("Enter the length of the 2nd array : ");
        int m = in.nextInt();
        int[] nums2 = new int[m];
        System.out.print("Enter the elements in the 2nd array : ");
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }
        System.out.print("Enter the merge length for 1st array : ");
        int k = in.nextInt();
        System.out.print("Enter the merge length for 2st array : ");
        int l = in.nextInt();

        merge(nums1, k, nums2,l);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;     // nums1's index (actual nums)
        int j = n - 1;     // nums2's index
        int k = m + n - 1; // nums1's index (next filled position)

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
