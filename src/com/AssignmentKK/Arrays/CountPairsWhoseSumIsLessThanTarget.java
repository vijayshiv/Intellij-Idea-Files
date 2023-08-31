package com.AssignmentKK.Arrays;

import java.util.*;

public class CountPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = in.nextInt();

        System.out.print("Enter the elements in array : ");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            arr.add(num);
        }

        System.out.print("Enter the target sum : ");
        int target = in.nextInt();

        int ans = countPairs(arr,target);
        System.out.print("Total pairs are : " + ans);
    }
    public static int countPairs(List<Integer> nums, int target) {
        int ans = 0;

        for(int i = 0; i < nums.size(); i++){
            for(int j = i + 1; j < nums.size(); j++){
                if(nums.get(i) + nums.get(j) < target){
                    ans++;
                }
            }
        }
        return ans;
    }
}
