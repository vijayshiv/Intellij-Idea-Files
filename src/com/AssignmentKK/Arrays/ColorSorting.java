package com.AssignmentKK.Arrays;
/*
    Given an array nums with n objects colored red, white, or blue, sort
    them in-place so that objects of the same color are adjacent, with the colors
    in the order red, white, and blue.
    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    You must solve this problem without using the library's sort function.
    Example 1:
    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]
 */
import java.util.*;

public class ColorSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of elements in the array : ");
        int n = in.nextInt();
        System.out.print("Enter the elements : ");
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        sortColors(arr);
    }
    public static void swap(int x, int y, int[] nums){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public static void sortColors(int[] nums) {
        int front=0;
        int middle=0;
        int rear=nums.length - 1;
        while(middle <= rear){
            if(nums[middle] == 0){
                swap(front,middle,nums);
                front++;
                middle++;
            }
            else if(nums[middle] == 1) middle++;

            else{
                swap(middle,rear,nums);
                rear--;
            }
        }
        System.out.print("The sorted array is : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
