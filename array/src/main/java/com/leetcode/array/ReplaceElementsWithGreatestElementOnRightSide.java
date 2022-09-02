package com.leetcode.array;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;
        int max = -1;
        int p = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            if (p >= i) {
                max = -1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                        p = j;
                    }
                }
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    //geeksforgeeks
    static void nextGreatest(int arr[])
    {
        int size = arr.length;

        // Initialize the next greatest element
        int max_from_right =  arr[size-1];

        // The next greatest element for the rightmost
        // element is always -1
        arr[size-1] = -1;

        // Replace all other elements with the next greatest
        for (int i = size-2; i >= 0; i--)
        {
            // Store the current element (needed later for
            // updating the next greatest element)
            int temp = arr[i];

            // Replace current element with the next greatest
            arr[i] = max_from_right;

            // Update the greatest element, if needed
            if(max_from_right < temp)
                max_from_right = temp;
        }
    }
}
