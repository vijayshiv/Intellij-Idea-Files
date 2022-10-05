package com.Algorithms;

import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array -> ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array -> ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        SortSelect(arr);
        System.out.println(Arrays.toString(arr));
        in.close();
    }
    public static void SortSelect(int[] arr){
        //for every step i.e n-1
        for(int i = 0; i < arr.length; i++){
            // find the max item in the ramaining array and swap with the correct position or index
            int last = arr.length - i - 1;
            int maxindex = getMaxIndex(arr, 0, last);
            swapping(arr, maxindex, last);
        }
    }
    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swapping(int[] arr, int fisrt, int second){
        int temp = arr[fisrt];
        arr[fisrt] = arr[second];
        arr[second] = temp;
    }
}
