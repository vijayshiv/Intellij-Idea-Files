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
