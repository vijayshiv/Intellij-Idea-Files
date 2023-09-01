package com.AssignmentKK.Arrays;

import java.util.*;

public class SumKbeauty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        System.out.print("Enter the length of substring : ");
        int k = in.nextInt();
        int ans = divisorSubstrings(num, k);
        System.out.println("The total number of valid substrings are : " + ans);
    }
    public static int divisorSubstrings(int num, int k) {
        final String s = String.valueOf(num);
        int ans = 0;

        for (int i = 0; i + k <= s.length(); ++i) {
            final int x = Integer.parseInt(s.substring(i, i + k));
            if (x != 0 && num % x == 0)
                ++ans;
        }
        return ans;
    }
}
