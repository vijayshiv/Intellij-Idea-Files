/*
Sliding Window Fixed Size means in which kn ow of how many value sum we want
arr -> [1 2 3 4]
k -> 2
ansArray -> [3 5 7]
ansArray is like -> [(1+2) (2+3) (3+4)]

we are not actually iterating, but we are only adding the next element and subtracting the previous first
element from the sum we got already like ->
[ 1+2 = 3]
[ 3 + (3 - 1) = 5]
[ 5 + (4 - 2) = 7]

That's how we get [3 5 7]  as the ans.
 */

package com.Algorithms;
import java.util.*;
public class FixedSizeSlidingWindowTechnique {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array -> ");
        int n= in.nextInt();
        System.out.print("Enter the elements int he arrya -> ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the number of subArray value -> ");
        int k = in.nextInt();

        ArrayList<Integer> ans = SumSubArray(arr, k);
        System.out.println(ans);
    }
    public static ArrayList<Integer> SumSubArray(int[] arr, int k){
        int n = arr.length;
        ArrayList<Integer> ansArray = new ArrayList<>();
        for(int i = 0; i < n - k + 1; i++){
            int curSum = 0;
            for(int j = 0; j < k; j++){
                curSum = curSum + arr[i + j];
            }
            ansArray.add(curSum);
        }
        return ansArray;
    }
}
