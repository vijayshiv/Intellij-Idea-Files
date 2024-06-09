package com.AssignmentKK.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ConstantWindow {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        // size of the window
        int k = 3;
        int max = Integer.MIN_VALUE;

        int l = 0;
        int r = k - 1;
        int sum = 0;
        while (r < arr.length) {
            sum = 0;
            for (int i = l; i <= r; i++) {
                sum = sum + arr[i];
            }
            ans.add(sum);
            l++;
            r++;
            max = Math.max(max, sum);
        }
        System.out.print("All constant sum of four consecutive number -> ");
        ans.stream().forEach(e -> System.out.print(e + " "));
        System.out.println("\nMax Sum amoung all -> " + max);

    }
}