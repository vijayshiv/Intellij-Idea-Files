/*
367. Valid Perfect Square
Given a positive integer num, write a function which returns True if num is a perfect square else False.
Follow up: Do not use any built-in library function such as sqrt.

Example 1:
Input: num = 16
Output: true

Example 2:
Input: num = 14
Output: false
 */
package com.AssignmentKK.Searching;
import java.util.*;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check -> ");
        int n = in.nextInt();
        boolean ans = findValidPS(n);
        System.out.print("It is " + ans + " that " + n +" is a perfect square.");
        in.close();
    }
    public static boolean findValidPS(int num){
        if (num == 1) {
            return true;
        }

        int low = 1;
        int high = num / 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == num / mid && num % mid == 0) {
                return true;
            } else if (mid < num / mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
