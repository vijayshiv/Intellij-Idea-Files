package com.StringsandStringBuilder;

import java.util.*;

public class Performace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String s = "";
//        for (int i = 0; i < 26; i++) {
//            char ch = (char)('a' + i);
//            s = s + ch;
//        }
//        System.out.println(s);

        String str = "Vijayshiv";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print(ch + " ");
        }
         StringBuilder st = new StringBuilder();

    }
}
