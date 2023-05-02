package com.Algorithms;

import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int[] arr ={1, 12, 33, 35, 65, 78, 90, 101};
        int target = 90;
        System.out.println(bnr(arr, target,0, arr.length - 1));
    }

    public static int bnr (int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;

        if(target == arr[m]){
            return m;
        }

        if(target > arr[m]){
            return bnr(arr, target, m + 1, e);
        }

        return bnr(arr, target, s, m - 1);
    }
}
