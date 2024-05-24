package com.AssignmentKK.Arrays;

public class Leetcode11 {
    public static void main(String[] args) {
        int height[] = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = 0, j = height.length - 1, maxarea = 0;

        while (i < j) {
            int currentheight = Math.min(height[i], height[j]);
            int currentarea = currentheight * (j - i);
            maxarea = Math.max(maxarea, currentarea);
            if (height[i] < height[j])
                i++;
            else
                j--;
        }
        System.out.println(maxarea);

    }
}
