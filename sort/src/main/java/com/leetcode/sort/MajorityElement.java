package com.leetcode.sort;

public class MajorityElement {
    /**
     * 169 Easy
     *
     * Given an array nums of size n, return the majority element.
     *
     * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
     *
     * Runtime: 4 ms, faster than 55.13% of Java online submissions for Majority Element.
     * Memory Usage: 56.5 MB, less than 35.03% of Java online submissions for Majority Element.
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int p = quickSort(nums, nums.length/2, 0, nums.length -1);
        return nums[p];
    }

    private int quickSort(int[] nums, int mid, int l, int r) {
        int p = partition(nums, l, r);

        if(p == mid) {
            return p;
        } else if (p > mid) {
            return quickSort(nums, mid, l, p -1);
        } else {
            return quickSort(nums, mid, p+1, r);
        }
    }

    private int partition(int[] nums, int l, int r) {
        int pivot = nums[r];
        int p = l;
        for(int i = l; i < r; i ++) {
            if(nums[i] < pivot) {
                if (i != p) {
                    swap(nums, i, p);
                }
                p++;
            }
        }
        swap(nums, p, r);
        return p;
    }

    private void swap(int[] nums, int i, int p) {
        int temp = nums[i];
        nums[i] = nums[p];
        nums[p] = temp;
    }
}
