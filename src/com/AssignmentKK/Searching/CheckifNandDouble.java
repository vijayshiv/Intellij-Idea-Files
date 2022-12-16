/*
1346. Check If N and Its Double Exist
Given an array arr of integers, check if there exist two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]

Example 1:
Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]

Example 2:
Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.
 */
package com.AssignmentKK.Searching;
import java.util.*;

public class CheckifNandDouble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array -> ");
        int n = in.nextInt();
        System.out.print("Enter the number in array -> ");
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        boolean ans = checkIfExist(num);
        System.out.println("It is " + ans + " that the double of N is present");
    }
    public static boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int target = arr[i];
            for(int j = 0; j < arr.length; j++){
                if(target == arr[j]*2){
                    if(i != j){
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
