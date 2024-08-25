package com.AssignmentKK.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringHashing {

    public static void hashFunc(String word) {
//        int[] hash = new int[26];
//        for (int i = 0; i < word.length(); i++) {
//            char c = word.charAt(i);
//            if (c >= 'a' && c <= 'z')
//                hash[c - 'a']++;
//            else if (c >= 'A' && c <= 'Z')
//                hash[c - 'A']++;
//        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
        }

//        for (char k : map.keySet()) {
//            System.out.println(map.get(k));
//        }


    }

    public static void hashMaping(String[] str) {


    }


    public static String reverseOnlyLetters(String s) {
        String ss = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
                ss += s.charAt(i);
        }
        String ssn = "";
        for (int i = 0; i < ss.length(); i++) {
            ssn = ss.charAt(i) + ssn;
        }

        StringBuilder ans = new StringBuilder(s);
        System.out.println("ssn -> " + ssn);
        System.out.println("String builder -> " + ans);
        for (int i = 0, j = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                System.out.println("Ans is -> " + ans + "   for the iteration number=" + i + "  and j=" + j + "  ssn.charAt(j)=" + ssn.charAt(j));
                ans.setCharAt(i, ssn.charAt(j++));
                System.out.println("Ans is -> " + ans + "   for the iteration number=" + i + "  and j=" + j);
                System.out.println();
                continue;
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
//        String s = "ab-cd";
//        String ans = reverseOnlyLetters(s);
//        System.out.println(ans);

//        String word = "sassdrf";
//        String[] words = {"iii", "ioaus", "ghjas"};
//        hashFunc(word);

        String s1 = "ab";
        String s2 = "vijayshiv";
        String s = "";

        for(int i = s2.length() - 1; i >=0 ; i--){
            s = s + s2.charAt(i);
        }

        System.out.println(s);


    }
}
