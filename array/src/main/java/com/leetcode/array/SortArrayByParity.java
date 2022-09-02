package com.leetcode.array;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        if (nums == null || nums.length <= 1)
            return nums;
        int[] result = new int[nums.length];
        int odd = 0;
        int event = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[odd++] = nums[i];
            } else {
                result[event--] = nums[i];
            }
        }
        return  result;
    }
}
