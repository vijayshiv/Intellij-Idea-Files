package com.AssignmentKK.Arrays;

import java.util.*;
import java.util.ArrayList;
/*
    You are given an array items, where each items[i] = [typei, colori, namei] describes the type,
    color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
    The ith item is said to match the rule if one of the following is true:

    ruleKey == "type" and ruleValue == typei.
    ruleKey == "color" and ruleValue == colori.
    ruleKey == "name" and ruleValue == namei.
    Return the number of items that match the given rule.
 */
public class CountItemsMatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<List<String>> arraylist2D = new ArrayList<>();

// Create first list
        List list1=new ArrayList();
        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");

// Create second list
        List list2=new ArrayList();
        list2.add("computer");
        list2.add("silver");
        list2.add("lenevo");

// Create third list
        List list3=new ArrayList();
        list3.add("phone");
        list3.add("black");
        list3.add("iphone");

// Create fourth list
        List list4=new ArrayList();
        list4.add("phone");
        list4.add("purple");
        list4.add("iphone");

// Create fifth list
        List list5=new ArrayList();
        list5.add("laptop");
        list5.add("gold");
        list5.add("imac");

// Create sixth list
        List list6=new ArrayList();
        list6.add("phone");
        list6.add("green");
        list6.add("iphone");

// Add individual list to arraylist2D
        arraylist2D.add(list1);
        arraylist2D.add(list2);
        arraylist2D.add(list3);
        arraylist2D.add(list4);
        arraylist2D.add(list5);
        arraylist2D.add(list6);

        System.out.println(arraylist2D);

        System.out.print("Enter the ruleKey : ");
        String ruleKey = in.next();
        System.out.print("Enter the ruleValue : ");
        String ruleValue = in.next();

        int ans  = countMatches(arraylist2D, ruleKey,ruleValue);
        System.out.println("Only " + ans + " found that matches the required given information");

    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if(ruleKey.equals("color")){
            index = 1;
        } else if(ruleKey.equals("name")){
            index = 2;
        }
        int count = 0;
        for(List<String> item : items){
            if(item.get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
