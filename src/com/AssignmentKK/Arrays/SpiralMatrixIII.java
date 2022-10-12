package com.AssignmentKK.Arrays;
/*
    Not done yet. Its copy and pasted
 */
import java.util.*;
public class SpiralMatrixIII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of rows -> ");
        int n = in.nextInt();
        System.out.print("Input number of columns -> ");
        int m = in.nextInt();
        System.out.print("Input row number you want to start -> ");
        int r = in.nextInt();
        System.out.print("Input column number you want to start -> ");
        int c = in.nextInt();
        
        int[][] ans = spiralMatrixIII(n,m,r,c);
        display(ans);
    }
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        List<int[]> ans = new ArrayList<>();
        final int[] dx = {1, 0, -1, 0};
        final int[] dy = {0, 1, 0, -1};

        ans.add(new int[] {rStart, cStart});

        for (int i = 0; ans.size() < rows * cols; ++i)
            for (int step = 0; step < i / 2 + 1; ++step) {
                rStart += dy[i % 4];
                cStart += dx[i % 4];
                if (0 <= rStart && rStart < rows && 0 <= cStart && cStart < cols)
                    ans.add(new int[] {rStart, cStart});
            }

        return ans.toArray(new int[ans.size()][]);
    }
    public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.print("]");
        }
    }
}
