package com.AssignmentKK.Arrays;
/*
    There are n kids with candies. You are given an integer array candies, where each candies[i]
    represents the number of candies the ith kid has, and an integer extraCandies, denoting the
    number of extra candies that you have.
    Return a boolean array result of length n, where result[i] is true if,
    after giving the ith kid all the extraCandies, they will have the greatest
    number of candies among all the kids, or false otherwise.

    Input: candies = [2,3,5,1,3], extraCandies = 3
    Output: [true,true,true,false,true]
    Explanation: If you give all extraCandies to:
    - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
    - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
    - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
    - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
    - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidWithGreatestNumberofCandies {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        System.out.print("Enter the number of extra candies : ");
        int c = in.nextInt();
        List<Boolean> ans = kidsWithCandies(num, c);
        System.out.println(ans.stream().toList());

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            candies[i] += extraCandies;
            if (candies[i] >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
