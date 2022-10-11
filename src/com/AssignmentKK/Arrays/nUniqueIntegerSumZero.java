package com.AssignmentKK.Arrays;

import java.util.*;

public class nUniqueIntegerSumZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array -> ");
        int n = in.nextInt();
        int[] ans = sumZero(n);
        System.out.print("The required array is -> " + Arrays.toString(ans));
    }
    public static int[] sumZero(int n) {
        int[] res = new int[n];
        int left = 0, right = n - 1, start = 1;
        while (left < right) { // in the middle is zero
            res[left++] = start;
            res[right--] = -start;
            start++;
        }
        return res;
    }
}
