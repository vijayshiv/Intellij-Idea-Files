package com.AssignmentKK.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode648 {
    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < dictionary.size(); j++) {
                if (s[i].startsWith(dictionary.get(j))) {
                    s[i] = dictionary.get(j);
                }
            }
        }
        return String.join(" ",s);
    }

    public static void main(String[] args) {
        List<String> dic = new ArrayList<>(Arrays.asList("cat", "rat", "bat"));
        String sen = "the cattle was rattled by the battery";

        String ans = replaceWords(dic, sen);
        System.out.println(ans);

    }
}
