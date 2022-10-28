package com.Recursion;
import java.util.*;

public class DecreasingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number : ");
        int n = in.nextInt();
        System.out.print("The decreasing order is : ");
        Decrease(n);
    }
    public static void Decrease(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        Decrease(n - 1);
    }
}
