package com.AssignmentKK.Searching;
import java.util.*;
public class ArrangingCoin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of coins -> ");
        int n = in.nextInt();
        int ans = Arrange(n);
        System.out.print("The total steps are -> " + ans);
    }
    // O(n)
    public static int Arrange(int n) {
        int i = 1;
        int res = 0;
        while(n >= i){
            n -= i;
            res++;
            i++;
        }
        return res;
    }

    //O(logn) time
    public static int Arrange2(int n) {
        long le = 0, ri = n;
        while (le <= ri){
            long mid = le + (ri - le) / 2;

            // sum of n terms is (n(n+1))/2
            if (n >= (mid * (mid + 1) / 2)) {
                le = mid + 1;
            }
            else {
                ri = mid - 1;
            }
        }
        return (int)le - 1;
    }

    //O(1) time
    public static int Arrange3(int n) {
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);
    }
}
