package com.AssignmentKK.Arrays;

import java.util.Scanner;

/*
    Given a square matrix mat, return the sum of the matrix diagonals.
    Only include the sum of all the elements on the primary diagonal and
    all the elements on the secondary diagonal that are not part of the primary diagonal.
    Input: mat =    [[1,2,3],
                    [4,5,6],
                    [7,8,9]]
    Output: 25
    Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
    Notice that element mat[1][1] = 5 is counted only once.
 */
public class DiagonalMatrixSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows and column : ");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        System.out.print("Enter the indices array : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int ans = diagonalSum(arr);
        System.out.println("The sum the diagonals of the matrix is : " + ans);

        int ans2 = diagonalSumOptimized(arr);
        System.out.println("The sum the diagonals of the matrix is : " + ans2);
    }
    public static int diagonalSum(int[][] mat) {
        int res = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(i == j){
                    res += mat[i][j];
                } else  if(i + j == mat.length - 1){
                    res += mat[i][j];
                }
            }
        }
        return res;
    }
    public static int diagonalSumOptimized(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[n-i-1][i];
        }
        return n % 2 == 0 ? sum : sum - mat[n/2][n/2];
    }
}
