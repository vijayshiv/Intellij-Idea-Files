package com.AssignmentKK.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReshapeMatrixx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input length : ");
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.print("Input the elements in the matrix : ");
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print("Input the required dimensions of the output matrix you want -> ");
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] ans = matrixReshape(arr, a, b);
        display(ans);
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length * mat[0].length) != (r *c)){
            return mat;
        }
        int[][] result = new int[r][c];
        for(int i = 0; i < r; i++){
            int k = 0;
            for(int j = 0; j < c; j++, k++){
                result[i][j] = mat[k / mat[0].length][k % mat[0].length];
            }
        }
        return result;
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
