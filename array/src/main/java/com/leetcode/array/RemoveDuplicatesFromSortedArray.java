package com.leetcode.array;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1) {
            return 1;
        }
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[p - 1]) {
                nums[p] = nums[i];
                p++;
            }
        }
        return p;
    }
}
