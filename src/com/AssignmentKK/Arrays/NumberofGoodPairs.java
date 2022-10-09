package com.AssignmentKK.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NumberofGoodPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        int ans = numIdenticalPairs(num);
        System.out.println("The running sum array is : " + ans);
    }
    public static int numIdenticalPairs(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    res++;
                }
            }
        }
        return res;
    }
}
