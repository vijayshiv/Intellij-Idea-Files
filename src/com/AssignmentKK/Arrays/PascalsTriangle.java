package com.AssignmentKK.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static int nCr(int n, int r) {
        // this is the result of each element that we will get through this function like
        /*
         *     1
         *   1 2 1
         *  1 3 3 1
         * 1 4 6 4 1
         */
        // to get 2 we can say that row is 1 col is 1
        // n = row + 1, r = col + 1
        // apply  nCr formula - n! / r! * (n-r)! = 2/ 1 = 1
        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public static List<List<Integer>> printPascaltriangle(int rowNums) {
        List<List<Integer>> ans = new ArrayList<>();
        // we will start from 1 as 0 will get in the formula of nCr
        for (int r = 1; r <= rowNums; r++) {
            List<Integer> temp = new ArrayList<>();
            for (int c = 1; c <= r; c++) {
                temp.add(nCr(r - 1, c - 1));
            }
            ans.add(temp);
        }

        return ans;
    }

    public static void main(String[] args) {
        // this is to print the entire pascal triangle
        int n = 5;
        List<List<Integer>> ans = printPascaltriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        // to get only the element at specified position
        int element = nCr(3,2);
        System.out.println(element);
    }
}
