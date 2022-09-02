package com.leetcode.array;

public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return;
        }
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] == 0) {
                int previous = arr[i];
                int temp = previous;
                for (int j = i + 1; j < arr.length; j ++){
                    temp = arr[j];
                    arr[j] = previous;
                    previous = temp;
                }
                i += 2;
            } else {
                i++;
            }
        }
    }
}
