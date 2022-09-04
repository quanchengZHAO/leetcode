package com.leetcode.sort;

import java.util.Arrays;

public class KthLeastElementsInAnArray {
    /**
     * Given an integer array, then returns the Ks least numbers
     * <p>
     * Input: arr = [3,2,1], k = 2
     * Output: [1,2] or [2,1]
     *
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        buildMinHeap(arr);

        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            swap(arr, 0, i);
            minHeapify(arr, 0, i);
        }

        return Arrays.copyOfRange(arr, arr.length - k, arr.length);
    }

    private void buildMinHeap(int[] arr) {
        int start = (arr.length - 1) / 2; // last node's parent
        for (int i = start; i >= 0; i--) {
            minHeapify(arr, i, arr.length);
        }
    }

    /**
     * Heapify the array to a min binary tree
     *
     * @param arr
     * @param i
     */
    private void minHeapify(int[] arr, int i, int heapSize) {
        if (i >= heapSize) {
            return;
        }
        int c1 = (2 * i) + 1; // left child
        int c2 = (2 * i) + 2;// right child

        int smallest = i;

        if (c1 < heapSize && arr[c1] < arr[i]) {
            smallest = c1;
        }

        if (c2 < heapSize && arr[c2] < arr[smallest]) {
            smallest = c2;
        }

        if (smallest != i) {
            swap(arr, i, smallest);
            minHeapify(arr, smallest, heapSize);
        }

    }

    private void swap(int[] arr, int p, int q) {
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
    }
}
