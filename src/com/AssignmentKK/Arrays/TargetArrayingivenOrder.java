package com.AssignmentKK.Arrays;

import java.util.List;
import java.util.*;

/*
    Given two arrays of integers nums and index. Your task is to create target array under the following rules:
    Initially target array is empty.
    From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
    Repeat the previous step until there are no elements to read in nums and index.
    Return the target array.

    It is guaranteed that the insertion operations will be valid.
    Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
    Output: [0,4,1,3,2]
    Explanation:
    nums       index     target
    0            0        [0]
    1            1        [0,1]
    2            2        [0,1,2]
    3            2        [0,1,3,2]
    4            1        [0,4,1,3,2]
 */
public class TargetArrayingivenOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = in.nextInt();
        int[] nums = new int[n];
        int[] index = new int[n];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < index.length; i++) {
            index[i] = in.nextInt();
        }
        int val[] = createTargetArray(nums, index);
        System.out.println("The answer is " + Arrays.toString(val));

        int val1[] = createTargetArray1(nums, index);
        System.out.println("The answer is " + Arrays.toString(val1));
    }
    // This is the bruteforce code
    public static int[] createTargetArray(int[] nums, int[] index) {
        int length=nums.length;
        int[] result=new int[length];
        for(int i=0;i<length;i++){
            if(i==index[i]) {
                result[i] = nums[i];
            }else{

                int min=Math.min(i,index[i]);
                int max=Math.max(i,index[i]);
                for(int j=max;j>min;j--){
                    int tmp=result[j];
                    result[j]=result[j-1];
                }
                result[min]=nums[i];
            }
        }
        return result;
    }
    // More optimized code
    public static int[] createTargetArray1(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            result[i]=list.get(i);
        }
        return result;
    }
}