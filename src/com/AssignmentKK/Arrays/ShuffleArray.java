package com.AssignmentKK.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    Return the array in the form [x1,y1,x2,y2,...,xn,yn].
    Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7]
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */
public class ShuffleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int m = in.nextInt();
        int[] num = new int[m];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        System.out.print("Enter the shuffle length : ");
        int n = in.nextInt();
        int[] ans = shuffle(num, n);
        System.out.println("The running sum array is : " + Arrays.toString(ans));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int j = 0;
        for(int i = 0; i < nums.length; i +=2){
            result[i] = nums[j];
            result[i + 1] = nums[n + j];
            j++;
        }
        return result;
    }
}
