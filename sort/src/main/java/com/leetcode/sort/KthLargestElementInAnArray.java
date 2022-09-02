package com.leetcode.sort;

public class KthLargestElementInAnArray {

    /**
     * 215 Medium
     * Given an integer array nums and an integer k, return the kth largest element in the array.
     * <p>
     * Note that it is the kth largest element in the sorted order, not the kth distinct element.
     * <p>
     * You must solve it in O(n) time complexity.
     *
     * <p>
     * Use quick sort, find the pivot and only reorder values smaller or bigger than the pivot
     *
     * - Worst case: O(n²)
     * - Ideal case: O(logn)
     * - Average : O(n)
     *
     * Result:
     * Runtime: 26 ms, faster than 63.85% of Java online submissions for Kth Largest Element in an Array.
     * Memory Usage: 70.5 MB, less than 48.71% of Java online submissions for Kth Largest Element in an Array.
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSort(int[] nums, int l, int r, int k) {
        int pivot = nums[r];
        int p = l;

        for (int i = l; i < r; i++) {
            if (nums[i] <= pivot) {
                // swap the smaller value to left
                if (i > p) {
                    swap(nums, i, p);
                }
                p++;
            }
        }
        // swap p and r value, then elements left to p is smaller than nums[p] and right p is bigger than nums[p]
        swap(nums, p, r);

        if (p < k) {
            return quickSort(nums, p + 1, r, k);
        } else if (p > k) {
            return quickSort(nums, l, p - 1, k);
        } else {
            return nums[p];
        }

    }

    /**
     * Some improvements on findKthLargestTimeLimitExceeded.
     * Test whether k is bigger or smaller than half size.
     * <p>
     * If k is smaller than the array length, then find kth largest number
     * <p>
     * If k is bigger than the array lengh, then find (length - k + 1)th smallest number
     * <p>
     * Selection sort doesn't pass : Time Limit Exceeded
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargestTestK(int[] nums, int k) {
        if (k < nums.length / 2) {
            return findKthLargestTimeLimitExceeded(nums, k);
        } else {
            return findKthSmallest(nums, nums.length - k + 1);
        }
    }

    public int findKthSmallest(int[] nums, int k) {
        int minIndex = 0;
        for (int i = 0; i < k; i++) {
            minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            swap(nums, i, minIndex);
        }
        return nums[k - 1];
    }

    /**
     * First solution: use selection sort. Time complexity is O(kn)
     * Selection sort doesn't pass : Time Limit Exceeded
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargestTimeLimitExceeded(int[] nums, int k) {
        int maxIndex = 0;
        for (int i = 0; i < k; i++) {
            maxIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[maxIndex] < nums[j]) {
                    maxIndex = j;
                }
            }
            swap(nums, i, maxIndex);
        }
        return nums[k - 1];
    }

    private void swap(int[] nums, int i, int maxIndex) {
        int temp = nums[i];
        nums[i] = nums[maxIndex];
        nums[maxIndex] = temp;
    }
}
