package com.Algorithms;

import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = in.nextInt();
        int[] a = new int[n];

        System.out.print("Enter the array : ");
        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }
        Bubble(a);
        System.out.println(Arrays.toString(a));
    }
    public static void Bubble(int[] a){
        boolean swapped;
        for(int i = 0; i < a.length; i++){
            swapped = false;
            for(int j = 1; j < a.length - i; j++){
                if(a[j] < a[j - 1]){
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
