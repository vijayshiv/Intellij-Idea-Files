//https://www.youtube.com/watch?v=uSrRvXntLOI

/*
436. Find Right Interval
You are given an array of intervals, where intervals[i] = [starti, endi] and each starti is unique.
The right interval for an interval i is an interval j such that startj >= endi and startj is minimized.
Note that i may equal j.
Return an array of right interval indices for each interval i. If no right interval exists for interval i,
then put -1 at index i.

Example 1:
Input: intervals = [[1,2]]
Output: [-1]
Explanation: There is only one interval in the collection, so it outputs -1.

Example 2:
Input: intervals = [[3,4],[2,3],[1,2]]
Output: [-1,0,1]
Explanation: There is no right interval for [3,4].
The right interval for [2,3] is [3,4] since start0 = 3 is the smallest start that is >= end1 = 3.
The right interval for [1,2] is [2,3] since start1 = 2 is the smallest start that is >= end2 = 2.

Example 3:
Input: intervals = [[1,4],[2,3],[3,4]]
Output: [-1,2,-1]
Explanation: There is no right interval for [1,4] and [3,4].
The right interval for [2,3] is [3,4] since start2 = 3 is the smallest start that is >= end1 = 3.
 */

package com.AssignmentKK.Searching;
import java.util.*;
public class FindRightInterval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of row and column -> ");
        int r = in.nextInt();
        int c = in.nextInt();
        System.out.print("Enter the elements in 2D array -> ");
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int[] ans = findRightInterval(arr);
        System.out.println(Arrays.toString(ans));
    }
    // this is the brute force approach with O(n^2) just used 2 pointer approach
    public static int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            int idx = -1;
            int minStart = Integer.MAX_VALUE;
            for (int j = 0; j < intervals.length; j++) {
                if(intervals[j][0] >= intervals[i][1] && minStart > intervals[j][0]) {
                    idx = j;
                    minStart = intervals[j][0];
                }
            }
            ans[i] = idx;
        }
        return ans;
    }

    // Now we are doing it with better algo using binary search and hashmaps
    // with O(NLog) complexity
    public static int[] optimizedfindRightInterval(int[][] intervals) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] first = new int[intervals.length];
        for( int i = 0 ; i < intervals.length; i++)
        {
            hm.put(intervals[i][0],i);
            first[i] = intervals[i][0];
        }
        Arrays.sort(first);
        int[] ans = new int[intervals.length];
        for( int i  = 0 ; i< intervals.length;i++)
        {
            int key = binarysearch(first,intervals[i][1]);
            if(key==first.length)
                ans[i]=-1;
            else if(key==0)
            {
                if(intervals[i][1] <= first[0])
                    ans[i]=hm.get(first[0]);
                else
                    ans[i]=-1;
            }
            else
                ans[i] = hm.get(first[key]);
        }
        return ans;
    }
    public static int binarysearch(int[] arr ,int target)
    {
        int s  =0 ;
        int e = arr.length-1;
        while(s <e)
        {
            int mid = s +(e-s)/2 ;
            if(arr[mid]<target)
                s=mid+1;
            else
                e=mid;
        }
        return s;
    }
}
