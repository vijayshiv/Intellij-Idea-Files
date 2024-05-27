package com.AssignmentKK.HashMap;

import java.util.*;

public class Leetcode2418 {
    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }

        List<String> v = new ArrayList<>(map.values());
        Collections.reverse(v);

        return v.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        String[] ans = sortPeople(names, heights);
        System.out.println(Arrays.toString(ans));
    }

}
