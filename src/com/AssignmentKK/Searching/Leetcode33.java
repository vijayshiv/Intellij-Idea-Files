package com.AssignmentKK.Searching;

public class Leetcode33 {
    public static int search(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[st] <= nums[mid]) {
                // first part is sorted i.e start to mid
                if (nums[st] <= target && nums[mid] > target)
                    end = mid - 1;
                else
                    st = mid + 1;
            } else {
                // second part is sorted i.e mid to end
                if (target > nums[mid] && nums[end] >= target)
                    st = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 0, 1, 2, 3, 4};
        int t = 3;

        int ans = search(arr, t);
        System.out.println(ans);
    }
}
