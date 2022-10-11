package com.AssignmentKK.Arrays;
/*
    The array-form of an integer num is an array representing its digits in left to right order.
    For example, for num = 1321, the array form is [1,3,2,1].
    Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
    Input: num = [1,2,0,0], k = 34
    Output: [1,2,3,4]
    Explanation: 1200 + 34 = 1234
 */
import java.util.*;

public class AddArrayFormInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array -> ");
        int n = in.nextInt();
        System.out.print("Enter the elements in array -> ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the number yoo want to add -> ");
        int k = in.nextInt();
        System.out.print("The output after addition -> ");
        System.out.print(addToArrayForm(arr,k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int cur = k; // we stored the value of k in cur
        List<Integer> result = new ArrayList<>();
        // we need the no od digits of the array
        int i = num.length;
        // the loop will run until the nod or cur becomes zero
        while(--i >= 0 || cur > 0){
            // if i is greater than equal to zero
            // then we add each
            if (i >= 0) {
                cur += num[i];
            }
            result.add(cur % 10);
            cur /= 10;
        }

        Collections.reverse(result);
        return result;
    }
}
