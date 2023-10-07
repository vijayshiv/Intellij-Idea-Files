package com.AssignmentKK.Strings;

import java.util.*;

public class ZigZagConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string here -> ");
        String str = in.next();
        System.out.print("Enter the number of rows -> ");
        int n = in.nextInt();

        String ans = convert(str, n);
        System.out.print("The answer is -> " + ans);
    }


    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean directionDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                directionDown = !directionDown;
            }
            currentRow += directionDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}

