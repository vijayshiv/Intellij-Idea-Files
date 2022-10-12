package com.AssignmentKK.Arrays;
/*
    Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
    Input: n = 3
    Output: [[1,2,3],
            [8,9,4],
            [7,6,5]]
 */
import java.util.*;

public class SpiralMatrixII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the dimensions of the array = ");
        int n = in.nextInt();
        int[][] ans = generateMatrix(n);
        display(ans);
    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if(n==0) {
            return matrix;
        }
        // first in this we created all the walls like top wall , left, right and bottom wall
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        // val is used to get the values from 1 to n in the matrix this will increment after every value got filled
        int val = 1;
        // this loop will terminate after all the values are filled
        while (val <= n * n) {
            // this loop will fill the top row then top will be top++ i.e. it will go the next row to fill
            for (int i = left; i <= right; i++){
                matrix[top][i] = val++; // fill top row
            }
            top++;
            // this will fill the right most column and right-- will decrement
            // the column value to get this pointer to left side
            for (int i = top; i <= bottom; i++){
                matrix[i][right] = val++; // fill right column
            }
            right--;
            // this will fill the bottom row and then decrement to fill the upper row
            for (int i = right; i >= left; i--){
                matrix[bottom][i] = val++; // fill bottom raw
            }
            bottom--;
            // this will fill the left row and this will increment the left side to right side
            for (int i = bottom; i >= top; i--){
                matrix[i][left] = val++; // fill right column
            }
            left++;
        }

        return matrix;
    }
    public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
    }
}

