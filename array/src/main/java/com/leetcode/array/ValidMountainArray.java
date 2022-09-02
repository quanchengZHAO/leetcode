package com.leetcode.array;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length == 1 || arr.length == 2)
            return false;
        int i = 1;
        boolean mount = false;
        while (i < arr.length -1) {
            int previous = arr[i - 1];
            int mid = arr[i];
            int next = arr[i + 1];
            if (previous == mid || mid == next) {
                return false;
            }
            if (mid < previous && mid < next) {
                return false;
            }
            if (mid > previous && mid > next) {
                if (mount == true) {
                    return false; // find a mount previously
                }
                mount = true;
            }
            i++;
        }
        return mount;
    }

    public boolean validMountainArraySolution(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }
}
