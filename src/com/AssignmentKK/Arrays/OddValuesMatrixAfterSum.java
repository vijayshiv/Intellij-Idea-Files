package com.AssignmentKK.Arrays;
/*
    There is an m x n matrix that is initialized to all 0's.
    There is also a 2D array indices where each indices[i] = [ri, ci] represents
    a 0-indexed location to perform some increment operations on the matrix.
    For each location indices[i], do both of the following:
    Increment all the cells on row ri.
    Increment all the cells on column ci.
    Given m, n, and indices, return the number of odd-valued cells in the matrix
    after applying the increment to all locations in indices.

    Input: m = 2, n = 3, indices = [[0,1],[1,1]]
    Output: 6
    Explanation: Initial matrix = [[0,0,0],[0,0,0]].
    After applying first increment it becomes [[1,2,1],[0,1,0]].
    The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
 */
import java.util.*;

public class OddValuesMatrixAfterSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = in.nextInt();
        System.out.print("Enter the number of columns : ");
        int n = in.nextInt();
        int[][] indices = new int[2][2];
        System.out.print("Enter the indices array : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                indices[i][j] = in.nextInt();
            }
        }
        int ans = oddCells(m,n,indices);
        System.out.println("This is other persons way to get ans  : " + ans);

        int ans2 = oddCells1(m,n,indices);
        System.out.println("This the most optimized way to get space complexity : " + ans2);

        int ans3 = oddCells2(m,n,indices);
        System.out.println("The ans using my way is : "+ ans3);
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        int res = 0;

        for (int[] pair : indices) {
            row[pair[0]]++;
            col[pair[1]]++;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (((row[i] + col[j])) % 2 != 0) {
                    res++;
                }
            }
        }
        return res;
    }
    // this is more optimized way to save memory
    public static int oddCells1(int m, int n, int[][] indices) {
        int row[] = new int[m];
        int col[] = new int[n];
        int count=0;
        for(int i=0;i<indices.length;i++){
            int x = indices[i][0];
            int y = indices[i][1];
            int x1 = row[x];
            int y1 = col[y];
            row[x] = x1+1;
            col[y] = y1+1;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((row[i]+col[j])%2!=0)
                    count++;
            }
        }
        return count;
    }
    public static int oddCells2(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n]; // this the new 0 value matrix of m x n
        int k = indices.length; // this the length of the indices matrix

        // This loop here is used to navigate through each row only
        for(int i = 0; i < k; i++){ // i = 0
            // i = 0, 1 only , as we only need to iterate through the indices value to get our ans
            // Here we are iterating in the
            for(int j = 0; j < n; j++){ // j = 0 , 1, 2
                ans[indices[i][0]][j]++; // ans[indices[0][0]][0] = ans[0][0]   ans[indices[0][0]][1] = ans[0][1]
                                         // ans[indices[0][0]][2] = ans[0][2]
            }
            for(int j = 0; j < m; j++){ // j = 0 ,1
                ans[j][indices[i][1]]++; // ans[0][indices[0][1]] = ans[0][1]   ans[1][indices[0][1]] = ans[1][1]
            }
        }
        int count = 0;
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){
                if(ans[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}
