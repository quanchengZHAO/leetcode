package com.leetcode.array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null && nums.length == 0)
            return 0;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                if (nums[j] == val) {
                    nums[j] = 0;
                    j--;
                } else if (nums[i] == val) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                    j--;
                }
            } else {
                i++;
            }
        }
        return i;
    }

    public int removeElementSolution(int[] nums, int val) {
        if (nums == null && nums.length == 0)
            return 0;
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}
