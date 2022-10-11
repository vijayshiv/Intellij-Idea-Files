package com.AssignmentKK.Arrays;
/*
    You are given a 2D integer array logs where each logs[i] = [birthi, deathi]
    indicates the birth and death years of the ith person.
    The population of some year x is the number of people alive during that year.
    The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1].
    Note that the person is not counted in the year that they die.
    Return the earliest year with the maximum population.
    Input: logs = [[1993,1999],[2000,2010]]
    Output: 1993
    Explanation: The maximum population is 1, and 1993 is the earliest year with this population.

    Solution - https://www.youtube.com/watch?v=v0xswVJnRlE
 */
import java.util.*;

public class MaxPopulationYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows -> ");
        int r = in.nextInt();
        System.out.print("Enter the elements in the array -> ");
        int logs[][] = new int[r][2];
        for (int i = 0; i < logs.length; i++) {
            for (int j = 0; j < logs[0].length; j++) {
                logs[i][j] = in.nextInt();
            }
        }
        int ans = maximumPopulation(logs);
        System.out.print("The ans is -> " + ans);
    }
    public static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];

        for(int log[] : logs){
            int by = log[0];
            int dy = log[1];
            arr[by - 1950]++;
            arr[dy - 1950]--;
        }
        int max = arr[0];
        int maxYear = 1950;
        for(int i = 1; i < 101 ; i++){
            arr[i] += arr[i - 1];
            if(max < arr[i]){
                max = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
}
