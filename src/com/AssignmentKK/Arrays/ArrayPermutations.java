package com.AssignmentKK.Arrays;
/*
    Given a zero-based permutation nums (0-indexed), build an array ans
    of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
    A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
    Input: nums = [0,2,1,5,3,4]
    Output: [0,1,2,4,5,3]
    Explanation: The array ans is built as follows:
    ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
        = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
        = [0,1,2,4,5,3]
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPermutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }

        int[] ans = buildArray(num);
        System.out.println("The permutated array is : " + Arrays.toString(ans));

    }
    public static int[] buildArray(int[] num) {
        int[] inv = new int[num.length];

        for(int i = 0; i < num.length; i++){
            inv[i] = num[num[i]];
        }

        return inv;
    }
}

