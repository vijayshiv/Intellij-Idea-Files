/*
888. Fair Candy Swap
Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and
bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j]
is the number of candies of the jth box of candy that Bob has.

Since they are friends, they would like to exchange one candy box each so that after the exchange, they both
have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies
in each box they have.

Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange,
and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you
may return any one of them. It is guaranteed that at least one answer exists.

Example 1:
Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]

Example 2:
Input: aliceSizes = [1,2], bobSizes = [2,3]
Output: [1,2]

Example 3:
Input: aliceSizes = [2], bobSizes = [1,3]
Output: [2,3]
 */
package com.AssignmentKK.Searching;
import java.lang.reflect.Array;
import java.util.*;

public class FairCandySwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of first array -> ");
        int n = in.nextInt();
        System.out.print("Enter the length of second array -> ");
        int m = in.nextInt();

        System.out.print("Enter the elements of fisrt array -> ");
        int[] num1 = new int[n];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = in.nextInt();
        }
        System.out.print("Enter the elements of fisrt array -> ");
        int[] num2 = new int[m];
        for (int i = 0; i < num2.length; i++) {
            num2[i] = in.nextInt();
        }

        int[] ans = fairCandySwap(num1, num2);
        System.out.print("The swapped candies are -> " + Arrays.toString(ans));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] result = new int[2];
        int totalA = 0;
        int totalB = 0;

        HashSet<Integer> Set = new HashSet<>();

        for(int a : aliceSizes){
            totalA += a;
        }
        for(int b : bobSizes){
            totalB += b;
            Set.add(b);
        }

        int delta = (totalB - totalA) / 2;
        for(int a : aliceSizes){
            if(Set.contains(a + delta)){
                result[0] = a;
                result[1] = a + delta;
                return result;
            }
        }
        return null;
    }
}
