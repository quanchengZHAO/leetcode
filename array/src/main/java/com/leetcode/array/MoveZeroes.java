package com.leetcode.array;

public class MoveZeroes {

    /**
     * 283 Easy
     * Given an integer array nums,
     * move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *
     * Time complexity: O(n)
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1)
            return;
        int p = 0; // Slow pointer
        for (int i = 0; i < nums.length; i ++) {
            // When fast pointer points to a not 0 element, then swap this element to the last 0
            if(nums[i] != 0) {
                if (i != p) {
                    nums[p] = nums[i];
                    nums[i] = 0;
                }
                p++;
            }
        }
    }

    public void moveZeroes1(int[] nums) {
        if (nums == null || nums.length <= 1)
            return;
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
