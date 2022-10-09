package com.Patterns;

import java.util.Map;
import java.util.Scanner;

public class NewPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = in.nextInt();

        int originalN = n;
        n = (2 * n) - 2;

        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n ; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
