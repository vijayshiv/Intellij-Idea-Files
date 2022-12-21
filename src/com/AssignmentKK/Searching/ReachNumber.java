/*
754. Reach a Number
You are standing at position 0 on an infinite number line. There is a destination at position target.
You can make some number of moves numMoves so that:
On each move, you can either go left or right.
During the ith move (starting from i == 1 to i == numMoves), you take i steps in the chosen direction.
Given the integer target, return the minimum number of moves required (i.e., the minimum numMoves) to reach the destination.

Example 1:
Input: target = 2
Output: 3
Explanation:
On the 1st move, we step from 0 to 1 (1 step).
On the 2nd move, we step from 1 to -1 (2 steps).
On the 3rd move, we step from -1 to 2 (3 steps).

Example 2:
Input: target = 3
Output: 2
Explanation:
On the 1st move, we step from 0 to 1 (1 step).
On the 2nd move, we step from 1 to 3 (2 steps).

 */
package com.AssignmentKK.Searching;
import java.util.*;
public class ReachNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the target steps -> ");
        int n = in.nextInt();
        int ans = findNum(n);
        System.out.print("The number steps must take to reach target is " + ans);
    }
    public static int findNum(int target){
        int sum = 0;
        int steps = 0;
        target = Math.abs(target);

        while(sum < target){
            sum += steps;
            steps++;
        }
        while((sum - target) % 2 == 1){
            sum += steps;
            steps++;
        }
        return  steps - 1;
    }
}
