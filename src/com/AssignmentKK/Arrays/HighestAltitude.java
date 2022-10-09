package com.AssignmentKK.Arrays;

import java.util.*;

/*
    There is a biker going on a road trip. The road trip consists of n + 1 points
    at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
    You are given an integer array gain of length n where gain[i] is the net gain in
    altitude between points i and i + 1 for all (0 <= i < n).
    Return the highest altitude of a point.
    Input: gain = [-5,1,5,0,-7]
    Output: 1
    Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

 */

public class HighestAltitude {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }

        int ans = largestAltitude(num);
        System.out.println("The highest altitude is : " + ans);
    }
    public static int largestAltitude(int[] gain) {
        int[] altiutdes = new int[gain.length + 1];
        altiutdes[0] = 0;
        int max = 0;
        for(int i = 1; i < altiutdes.length; i++){
            altiutdes[i] = altiutdes[i - 1] + gain[i - 1];
            if(max < altiutdes[i]){
                max = altiutdes[i];
            }
        }
        return max;
    }
}
