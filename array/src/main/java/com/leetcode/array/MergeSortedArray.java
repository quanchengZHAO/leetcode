package com.leetcode.array;

public class MergeSortedArray {
    //nums1.length == m + n
    //nums2.length == n
    //0 <= m, n <= 200
    //1 <= m + n <= 200
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null)
            return;
        if (nums1.length == 0) {
            nums1 = nums2;
            return;
        }

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
