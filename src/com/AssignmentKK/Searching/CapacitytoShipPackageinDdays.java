/*
1011. Capacity To Ship Packages Within D Days
A conveyor belt has packages that must be shipped from one port to another within days days.
The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the
conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.
Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

Example 1:
Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
Output: 15
Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
1st day: 1, 2, 3, 4, 5
2nd day: 6, 7
3rd day: 8
4th day: 9
5th day: 10

Note that the cargo must be shipped in the order given, so using a ship of capacity 14
and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.

Example 2:
Input: weights = [3,2,2,4,1,4], days = 3
Output: 6
Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
1st day: 3, 2
2nd day: 2, 4
3rd day: 1, 4

Example 3:
Input: weights = [1,2,3,1,1], days = 4
Output: 3
Explanation:
1st day: 1
2nd day: 2
3rd day: 3
4th day: 1, 1
 */
package com.AssignmentKK.Searching;
import java.util.*;
public class CapacitytoShipPackageinDdays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of total package -> ");
        int n = in.nextInt();
        System.out.print("Enter the number of weights in every package -> ");
        int[] piles = new int[n];
        for (int i = 0; i < piles.length; i++) {
            piles[i] = in.nextInt();
        }
        System.out.print("Enter the days to finish shipping -> ");
        int h = in.nextInt();
        int ans = shipWithinDays(piles, h);
        System.out.print("Minimum weights at which we can ship all packages with given conditions are -> " + ans);
    }
    public static int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for(int val : weights){
            sum += val;
            max = Math.max(max,val);
        }
        if(days == weights.length) {
            return max;
        }

        int lo = max;
        int hi = sum;
        int ans = 0;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2; // to not overflow the code

            if(isPossible(weights, mid ,days) == true){
                ans = mid;
                hi = mid - 1;
            }else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] weights, int mid, int days){
        int d = 1;
        int sum = 0;

        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];

            if(sum > mid){
                d++;
                sum = weights[i];
            }
        }
        return d <= days;
    }
}
