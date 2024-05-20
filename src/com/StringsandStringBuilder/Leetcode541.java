package com.StringsandStringBuilder;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Leetcode541 {
    public static String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int n = str.length;
        for (int i = 0; i <= n - 1; i += 2 * k) {
            if (i + k - 1 < n - 1) {
                reverse(i, i + k - 1, str);
            } else {
                reverse(i, n - 1, str);
            }
        }
        return new String(str);
    }

    public static void reverse(int i, int j, char[] str) {
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        String s = "abcdefgh";
        int k = 3;
        String str = reverseStr(s, k);
        System.out.println(str);
    }
}
