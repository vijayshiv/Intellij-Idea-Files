package com.AssignmentKK.Arrays;

import java.util.*;

public class SetMatrixZeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the rows -> ");
        int n = in.nextInt();
        System.out.print("Input the columns -> ");
        int m = in.nextInt();

        System.out.print("Input the array elements -> ");
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("The given array is -> ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        setZeroes(arr);
    }
    public static void setZeroes(int[][] matrix) {
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;{
                for (int j = 1; j < cols; j++){
                    if (matrix[i][j] == 0){
                        matrix[i][0] = matrix[0][j] = 0;
                    }
                }
            }
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--){
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
            if (col0 == 0){
                matrix[i][0] = 0;
            }
        }
        System.out.println("The required array is -> ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
