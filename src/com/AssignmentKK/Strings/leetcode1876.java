package com.AssignmentKK.Strings;

import java.util.HashSet;
import java.util.Set;

public class leetcode1876 {
    public static boolean hasRepeatedCharacters(String str) {
        Set<Character> characters = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!characters.add(ch)) {
                return true;
            }
        }
        return false;
    }

    public static int countGoodSubstrings(String s) {
        if (s.length() < 3)
            return 0;
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.length());
        String[] str = new String[s.length() - 2];
        for (int i = 0; i < sb.length() - 2; i++) {
            str[i] = sb.substring(i, i + 3);
        }
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (!hasRepeatedCharacters(str[i]))
                count++;

        }
        return count;
    }

    public static int countGoodSubstringsoptimized(String s) {
        int count = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length() - 2; i++)
            if (ch[i] != ch[i + 1] && ch[i] != ch[i + 2] && ch[i + 1] != ch[i + 2])
                count++;

        return count;
    }

    public static void main(String[] args) {
//        String s = "aababcabc";
        String s = "x";
//        String s = "xyzzaz";
        int ans = countGoodSubstrings(s);
        System.out.println("The number of good string is " + ans);
    }
}
