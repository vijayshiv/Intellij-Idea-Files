package com.AssignmentKK.Arrays;

import java.util.*;

/*
    A pangram is a sentence where every letter of the English alphabet appears at least once.
    Given a string sentence containing only lowercase English letters,
    return true if sentence is a pangram, or false otherwise.
    Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
    Output: true
    Explanation: sentence contains at least one of every letter of the English alphabet.
 */
public class SentencePangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String str = in.next();

        boolean ans = checkIfPangram(str);
        System.out.println(ans);
    }
    public static boolean checkIfPangram(String str) {
        boolean flag = false;
        // Here we are checking if the sentence that we input has 'a' in it. Then we iterated to 'b' and checked the
        // whole sentence again if 'b' is present in it.
        for(char ch = 'a'; ch <= 'z'; ch++){
            // We created a method which iterated over each value of the sentence and check if 'a' is found.
            boolean pangram = checkPangram(ch,str);
            // If 'a' is found then true is passed and else condition ran
            // And again the same thing is done for 'b' , 'c' ..... and so on
            if(pangram == false){
                // If 'a' is not found the loop will break that means we didn't have 'a' and for being pangram
                // we need to have each and every character
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }
    // This function is used to check the if 'a' , 'b' , 'c' ..... 'z' are present in the sentence through iteration
    public static boolean checkPangram(char ch, String str){
        for(char c : str.toCharArray()){
            if(c == ch){
                return true;
            }
        }
        return false;
    }
}
