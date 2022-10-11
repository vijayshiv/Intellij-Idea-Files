package com.AssignmentKK.Arrays;

import java.util.*;

/*
    Given two n x n binary matrices mat and target, return true
    if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
    Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
    Output: true
    Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
 */
public class MatrixObtainedByRotationEqual {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the dimensions of square matrix -> ");
        int n = in.nextInt();
        System.out.print("Enter the given matrix -> ");
        int mat[][] = new int[n][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        System.out.print("Enter the target matrix -> ");
        int[][] target = new int[n][n];
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target[0].length; j++) {
                target[i][j] = in.nextInt();
            }
        }

        boolean ans = findRotation(mat,target);
        System.out.print(ans);
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int[][] rotate = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                rotate[i][j] = mat[i][j];
        }
        for (int count = 1; count <= 4; count++) {
            int[][] temp = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    temp[j][n - 1 - i] = rotate[i][j];
            }
            rotate = temp;
            if (areSame(rotate, target))
                return true;
        }
        return false;
    }

    public static boolean areSame(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }
}
