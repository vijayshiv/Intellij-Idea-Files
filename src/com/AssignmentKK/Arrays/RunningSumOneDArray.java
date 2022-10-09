package com.AssignmentKK.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
    Given an array nums. We define a running sum of an array as
    runningSum[i] = sum(nums[0]…nums[i]).
    Return the running sum of nums.
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class RunningSumOneDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        int[] ans = runningSum(num);
        System.out.println("The running sum array is : " + Arrays.toString(ans));
    }
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                ans[i] = nums[i];
            }else{
                ans[i] = nums[i] + ans[i - 1];
            }
        }
        return ans;
    }
}
