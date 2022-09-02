package com.leetcode.sort;


import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

    /**
     * 506 Easy
     * <p>
     * You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.
     * <p>
     * The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
     * <p>
     * The 1st place athlete's rank is "Gold Medal".
     * The 2nd place athlete's rank is "Silver Medal".
     * The 3rd place athlete's rank is "Bronze Medal".
     * For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
     * Return an array answer of size n where answer[i] is the rank of the ith athlete.
     * <p>
     * Input: score = [10,3,8,9,4]
     * Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
     * Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].
     *
     * Solution: Use quick sort, time complexity is O(nlogn)
     *
     * Runtime: 8 ms, faster than 90.29% of Java online submissions for Relative Ranks.
     * Memory Usage: 54.1 MB, less than 59.97% of Java online submissions for Relative Ranks.
     *
     * @param score
     * @return
     */
    public String[] findRelativeRanks(int[] score) {
        String goldMedal = "Gold Medal";
        String silverMedal = "Silver Medal";
        String bronzeMedal = "Bronze Medal";

        int[] copy = score.clone();
        quickSort(score);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i+1);
        }

        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int position = map.get(copy[i]);
            switch (position){
                case 1:
                    result[i] = goldMedal;
                    break;
                case 2:
                    result[i] = silverMedal;
                    break;
                case 3:
                    result[i] = bronzeMedal;
                    break;
                default:
                    result[i] = String.valueOf(position);
                    break;
            }
        }
        return result;
    }

    private int[] quickSort(int[] nums) {
        return quickSort(nums, 0, nums.length - 1);
    }

    private int[] quickSort(int[] nums, int l, int r) {
        int mid = partition(nums, l, r);
        // Sort left part when left part has at least two numbers
        if (l != mid && l != mid - 1) {
            quickSort(nums, l, mid - 1);
        }
        // Sort right part when right part has at least two numbers
        if (mid + 1 != r && mid != r) {
            quickSort(nums, mid + 1, r);
        }
        return nums;
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int p = start;
        for (int i = start; i < end; i++) {
            if (arr[i] >= pivot) {
                if (i > p) {
                    swap(arr, p, i);
                }
                p++;
            }
        }
        swap(arr, p, end);
        return p;
    }

    private static void swap(int[] arr, int p, int q) {
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
    }

}
