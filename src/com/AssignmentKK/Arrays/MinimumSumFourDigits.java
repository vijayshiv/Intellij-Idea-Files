package com.AssignmentKK.Arrays;

import java.util.*;

public class MinimumSumFourDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        int ans = minimumSum(n);
        System.out.print("The ans is : " + ans);
    }
    public static int minimumSum(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        Arrays.sort(chars);
        System.out.println("The array is : " + Arrays.toString(chars));
        return (chars[0] - '0') * 10 + (chars[2] - '0') + (chars[1] - '0') * 10 + (chars[3] - '0');
    }
}
