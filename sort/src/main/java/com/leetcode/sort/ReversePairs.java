package com.leetcode.sort;

public class ReversePairs {
    /**
     * 493 Hard
     * <p>
     * Given an integer array nums, return the number of reverse pairs in the array.
     * <p>
     * A reverse pair is a pair (i, j) where 0 <= i < j < nums.length and nums[i] > 2 * nums[j].
     * <p>
     * Input: nums = [1,3,2,3,1]
     * Output: 2
     * Explanation: The reverse pairs are:
     * (1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
     * (3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
     * <p>
     * Input: nums = [2,4,3,5,1]
     * Output: 3
     * Explanation: The reverse pairs are:
     * (1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
     * (2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
     * (3, 4) --> nums[3] = 3, nums[4] = 1, 5 > 2 * 1
     * <p>
     * Runtime: 74 ms, faster than 77.44% of Java online submissions for Reverse Pairs.
     * Memory Usage: 71.9 MB, less than 66.10% of Java online submissions for Reverse Pairs.
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 5 * 104
     * -231 <= nums[i] <= 231 - 1
     * <p>
     * Time complexity: O(NlogN)
     * Space complexity: O(N)
     * 时间复杂度：O(N\log N)O(NlogN)，其中 NN 为数组的长度。
     * <p>
     * 空间复杂度：O(N)O(N)，其中 NN 为数组的长度。
     *
     * @param nums
     * @return
     */
    public int reversePairs(int[] nums) {
        int[] temp = new int[nums.length];
        return mergeSortAndCount(nums, 0, nums.length - 1, temp);
    }

    /**
     * Divide and conquer
     * For {nums}[l..r], we sort {nums}[l..mid] and {nums}[mid+1..r]
     *
     * @param nums
     * @param l
     * @param r
     * @param temp
     * @return
     */
    private int mergeSortAndCount(int[] nums, int l, int r, int[] temp) {
        int mid = l + (r - l) / 2;
        if (l == r) return 0;
        int leftCount = mergeSortAndCount(nums, l, mid, temp);
        int rightCount = mergeSortAndCount(nums, mid + 1, r, temp);
        int count = leftCount + rightCount;
        // Time Limit Exceeded, the left set should be the outer loop and no need to loop all elemetns in right set
//        for (int i = mid + 1; i <= r; i++) {
//            for (int j = l; j <= mid; j++) {
//                if (nums[j] - nums[i] > nums[i]) {
//                    count += mid - j + 1;
//                    break;
//                }
//            }
//        }
        int i = l;
        int j = mid + 1;
        while (i <= mid) {
            while (j <= r && (long) nums[i] > 2 * (long) nums[j]) {
                j++;
            }
            count += j - mid - 1;
            i++;
        }

        merge(nums, l, mid, r, temp);
        return count;
    }

    private int merge(int[] nums, int l, int mid, int r, int[] temp) {
        int count = 0;
        int p1 = l;
        int p2 = mid + 1;
        int p = l;

        while (p1 <= mid && p2 <= r) {
            if (nums[p1] <= nums[p2]) {
                temp[p] = nums[p1];
                p1++;
            } else {
                temp[p] = nums[p2];
                p2++;
            }
            p++;
        }

        if (p1 <= mid) {
            // Left array is still
            while (p <= r) {
                temp[p] = nums[p1];
                p++;
                p1++;
            }
        }

        if (p2 <= r) {
            // Left array is still
            while (p <= r) {
                temp[p] = nums[p2];
                p++;
                p2++;
            }
        }


        // Copy temp to original array
        while (l <= r) {
            nums[l] = temp[l++];
        }

        return count;
    }
}
