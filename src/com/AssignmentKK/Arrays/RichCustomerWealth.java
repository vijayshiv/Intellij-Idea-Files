package com.AssignmentKK.Arrays;
/*
    You are given an m x n integer grid accounts where accounts[i][j] is the amount
    of money the ith customer has the jth bank. Return wealth that the richest customer has.
    A customer's wealth is the amount of money they have in all their bank accounts.
    The richest customer is the customer that has the maximum wealth.
    Input: accounts = [[1,2,3],[3,2,1]]
    Output: 6
    Explanation:
    1st customer has wealth = 1 + 2 + 3 = 6
    2nd customer has wealth = 3 + 2 + 1 = 6
    Both customers are considered the richest with a wealth of 6 each, so return 6.
 */

import java.util.*;
public class RichCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] num = new int[n][m];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                num[i][j] = in.nextInt();
            }
        }
        int ans = maximumWealth(num);
        System.out.println("The wealthiest man is : " + ans);
    }
    public static int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int i = 0; i < accounts.length; i++) {
            int t = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                t += accounts[i][j];
            }
            res = Math.max(res, t);
        }
        return res;
    }
}
