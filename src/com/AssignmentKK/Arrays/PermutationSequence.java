package com.AssignmentKK.Arrays;

/*
60. Permutation Sequence
        The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

        By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

        "123"
        "132"
        "213"
        "231"
        "312"
        "321"
        Given n and k, return the kth permutation sequence.

 */
import java.util.*;

public class PermutationSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = in.nextInt();
        System.out.print("Enter the kth permutaion you want : ");
        int k = in.nextInt();

        String str = getPermutation(n,k);
        System.out.print("The ans is : " + str);
    }
    public static String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> nums = new ArrayList<>();
        int[] fact = new int[n + 1]; // fact[i] := i!

        for (int i = 1; i <= n; ++i)
            nums.add(i);

        Arrays.fill(fact, 1);
        for (int i = 2; i <= n; ++i)
            fact[i] = fact[i - 1] * i;

        --k; // 0-indexed

        for (int i = n - 1; i >= 0; --i) {
            final int j = k / fact[i];
            k %= fact[i];
            sb.append(nums.get(j));
            nums.remove(j);
        }

        return sb.toString();
    }

}

