package com.AssignmentKK.Arrays;

public class Leetcode1450 {

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            int s = startTime[i];
            int e = endTime[i];
            for (int j = s; j <= e; j++) {
                if (j == queryTime)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {3, 2, 7};
        int t = 4;
        int ans = busyStudent(a1, a2, t);
        System.out.println(ans);
    }
}
