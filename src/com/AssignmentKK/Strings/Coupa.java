package com.AssignmentKK.Strings;

import static java.lang.Integer.parseInt;

public class Coupa {
    public static int findMax(String s) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            String fHalf = "";
            for (int j = i + 1; j < s.length(); j++) {
                fHalf += s.charAt(j);
            }
            String sHalf = "";
            for (int k = 0; k <= i; k++) {
                sHalf += s.charAt(k);
            }

            if (!fHalf.isEmpty() && !sHalf.isEmpty()) {
                int f = Integer.parseInt(fHalf);
                int se = Integer.parseInt(sHalf);

                max = (int) Math.max(max, Math.pow(se, f));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "12345";
        int ans = findMax(s);
        System.out.println(ans);


        System.out.println((int) Math.pow(123, 45));

    }
}
