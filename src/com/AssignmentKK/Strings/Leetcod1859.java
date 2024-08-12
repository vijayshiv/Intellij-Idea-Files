package com.AssignmentKK.Strings;

public class Leetcod1859 {
    public static String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            int pos = (int) str[i].charAt(str[i].length() - 1);
            res[pos - 48 - 1] = str[i].substring(0, str[i].length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            sb.append(res[i]).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String ans = sortSentence(s);
        System.out.println(ans);
    }
}
