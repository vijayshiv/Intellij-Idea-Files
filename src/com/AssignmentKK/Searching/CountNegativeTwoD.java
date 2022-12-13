/*
1351. Count Negative Numbers in a Sorted Matrix
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
return the number of negative numbers in grid.

Example 1:
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.

Example 2:
Input: grid = [[3,2],[1,0]]
Output: 0
 */
package com.AssignmentKK.Searching;
import java.util.*;

public class CountNegativeTwoD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of row and column -> ");
        int r = in.nextInt();
        int c = in.nextInt();
        System.out.print("Enter the elements in 2D array -> ");
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int ans = countNegatives(arr);
        System.out.println("The total number of negatives are -> " + ans);
        int answer = bruteCountNegative(arr);
        System.out.println("The total number of negatives are(using bruteforce approach) -> " + answer);
    }
    public static int countNegatives(int[][] grid) {
        int rowlen = grid[0].length;
        int collen = grid.length;

        int i = 0;
        int j = rowlen - 1;
        int total = 0;

        while(i < collen && j >= 0){
            if(grid[i][j] < 0){
                total = total + collen - i;
                j--;
            } else{
                i++;
            }
        }
        return total;
    }
    public static int bruteCountNegative(int[][] grid){
        int res = 0 ;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] < 0){
                    res++;
                }
            }
        }
        return res;
    }
}
