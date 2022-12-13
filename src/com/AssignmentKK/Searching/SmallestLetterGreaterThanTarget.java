/*
744. Find Smallest Letter Greater Than Target

You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
There are at least two different characters in letters.Return the smallest character in letters that is
lexicographically greater than target. If such a character does not exist, return the first character in letters.

Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
 */
package com.AssignmentKK.Searching;
import java.util.*;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of characters -> ");
        int n = in.nextInt();
        System.out.print("Enter the characters -> ");
        char[] letter = new char[n];
        for (int i = 0; i < letter.length; i++) {
            letter[i] = in.next().charAt(0);
        }
        System.out.print("Enter the target character -> ");
        char target = in.next().charAt(0);
        char ans = nextGreatestLetter(letter, target);
        System.out.println("The smallest letter greater than the target is " + ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;


        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length] ;
    }
}
