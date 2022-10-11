package com.AssignmentKK.Arrays;

import java.util.Scanner;

public class NumberWithEvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in hte array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int ans = findNumbers(arr);
        System.out.print("The number of even digits in the array : " + ans);
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int nod = 0;
            while(n > 0){
                n = n / 10;
                nod++;
            }
            if(nod % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
