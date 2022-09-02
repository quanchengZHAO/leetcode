package com.leetcode.sort;

import java.util.Arrays;

public class BuildMinimumNumberFromArray {

    /**
     * From an array with not negative numbers, then combine all
     * number together and print out a minimum number
     * <p>
     * Inout: [10,2]
     * Output: "102"
     * <p>
     * Inout: [3,30,34,5,9]
     * Output: "3033459"
     *
     * @param nums
     * @return
     */
    public String minNumber(int[] nums) {

        String[] strings = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            strings[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strings, (o1, o2) -> new StringBuilder(o1).append(o2).toString().compareTo(new StringBuilder(o2).append(o1).toString()));
        StringBuilder sb = new StringBuilder();
        Arrays.stream(strings).forEach(i -> sb.append(i));
        return sb.toString();
    }

}
