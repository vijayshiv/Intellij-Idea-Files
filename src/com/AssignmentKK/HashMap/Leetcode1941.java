package com.AssignmentKK.HashMap;


import java.util.HashMap;
import java.util.Map;

public class Leetcode1941 {
    public static boolean areOccurrencesEqual(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ele = s.charAt(i);
            if (map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }

        int val = map.values().iterator().next();
        for(Integer i : map.values()){
            if(i != val)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "ababcc";
        boolean ans = areOccurrencesEqual(s);
        System.out.println(ans);
    }
}
