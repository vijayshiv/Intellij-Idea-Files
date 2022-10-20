package com.AssignmentKK.Arrays;

import java.util.*;

public class ArrayProductSelf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the length of the array -> ");
        int n = in.nextInt();
        System.out.print("Input array elements -> ");
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        int[] ans = productExceptSelf(arr);
        System.out.print("The output array is " + Arrays.toString(ans));

    }
    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        for(int i = 1; i < nums.length; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }
        int right = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            right *= nums[i + 1];
            left[i] *= right;
        }
        return left;
    }
}
