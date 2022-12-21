package com.AssignmentKK.Searching;
import java.util.*;
public class kokoEatingBanana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of piles -> ");
        int n = in.nextInt();
        System.out.print("Enter the number of bananas in every pile -> ");
        int[] piles = new int[n];
        for (int i = 0; i < piles.length; i++) {
            piles[i] = in.nextInt();
        }
        System.out.print("Enter the hours to finish eating -> ");
        int h = in.nextInt();
        int ans = minEatingSpeed(piles, h);
        System.out.print("Minimum speed at which we can eat all bananas with given conditions are -> " + ans);
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int val : piles){
            max = Math.max(val, max);
        }
        if(h == piles.length) {
            return max;
        }

        int lo = 0;
        int hi = max;
        int minSpeed = Integer.MAX_VALUE;

        while(lo <= hi){
            int sp = lo + (hi - lo) / 2; // to not overflow the code

            if(isPossible(piles, sp ,h) == true){
                minSpeed = sp;
                hi = sp - 1;
            }else {
                lo = sp + 1;
            }
        }
        return minSpeed;
    }
    public static boolean isPossible(int[] piles, int sp, int h){
        int time = 0;

        for (int i = 0; i < piles.length; i++) {
            time += (int)Math.ceil(piles[i]*1.0/sp);
        }
        return time <= h;
    }
}
