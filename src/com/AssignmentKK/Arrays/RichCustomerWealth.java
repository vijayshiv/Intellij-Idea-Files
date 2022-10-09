package com.AssignmentKK.Arrays;

import java.util.Arrays;
import java.util.Scanner;

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
