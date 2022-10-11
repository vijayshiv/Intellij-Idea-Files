package com.AssignmentKK.Arrays;
/*
    Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
    A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
    Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
    Output: [15]
    Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

    same as Saddle point in pepcoding.

 */
import java.util.*;
public class LuckyNumberinMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input length : ");
        int n = in.nextInt();
        System.out.print("Input the elements in the matrix : ");
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        List<Integer> ans = luckyNumbers(arr);
        System.out.println("The saddle point is " + ans);
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < matrix[i][row[i]]) {
                    row[i] = j;
                }

                if (matrix[i][j] > matrix[col[j]][j]) {
                    col[j] = i;
                }
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int j = row[i];
            if (col[j] == i) {
                res.add(matrix[i][j]);
            }
        }

        return res;
    }
}
