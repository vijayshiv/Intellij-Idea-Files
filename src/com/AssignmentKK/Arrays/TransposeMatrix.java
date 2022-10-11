package com.AssignmentKK.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = in.nextInt();
        System.out.print("Enter the number of columns : ");
        int c = in.nextInt();

        System.out.print("Enter the elements in the matrix : ");
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        if(r == c){
            System.out.println("It is a square matrix hence transposeSquare method is called");
            int[][] square = transposeSquare(arr);
            display(square);
        } else {
            System.out.println("It is a rectangular matrix hence transposeAll method is called");
            int[][] all = transposeAll(arr);
            display(all);
        }

    }
    // This code is for only square matrix
    // This code is optimized for memory as we are not creating any new matrix
    public static int[][] transposeSquare(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
    // This code is optimized for m x n matrix i.e. any rectangular or square matrix
    public static int[][] transposeAll(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; ++i){
            for (int j = 0; j < matrix[0].length; ++j){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
    public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
