package com.AssignmentKK.Arrays;

import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the length of the array -> ");
        int n = in.nextInt();
        System.out.print("Input array elements -> ");
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums) {
        int i = 0;
        for (final int num : nums)
            if (num != 0)
                nums[i++] = num;

        while (i < nums.length)
            nums[i++] = 0;

        System.out.println(Arrays.toString(nums));
    }
}
