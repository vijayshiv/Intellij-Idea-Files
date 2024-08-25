package com.AssignmentKK.Arrays;

import java.util.Arrays;

public class Coupa {
    public static int findAns(int[] arr) {
        int ans = Integer.MIN_VALUE;

        int[] fH = new int[arr.length / 2];
        int[] sH = new int[arr.length / 2];
        fH[0] = arr[0];
        sH[0] = arr[arr.length - 1];

        int i = 1;
        int j = arr.length - 2;
        int k = 1;
        int l = 1;

        int trav = 0;

        while (trav < arr.length / 2) {
            if (arr[i - 1] > arr[i]) {
                fH[k] = arr[i];
                k++;
                i++;
            }
            if (arr[j + 1] <= arr[j]) {
                sH[l] = arr[j];
                l++;
                j--;
            }
            trav++;
        }
        System.out.println(Arrays.toString(fH));
        System.out.println(Arrays.toString(sH));

        for (int index = 0; index < sH.length; index++) {
            ans = Math.max(ans, Math.abs(fH[index] - sH[index]));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 8, 8};
        int ans = findAns(arr);
        System.out.println(ans);
    }
}
