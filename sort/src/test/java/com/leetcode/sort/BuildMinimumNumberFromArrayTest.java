package com.leetcode.sort;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildMinimumNumberFromArrayTest {

    BuildMinimumNumberFromArray buildMinimumNumberFromArray = new BuildMinimumNumberFromArray();

    @Test
    public void test1(){
        int[] nums = {10, 2};
        assertEquals("102", buildMinimumNumberFromArray.minNumber(nums));
    }

    @Test
    public void test2(){
        int[] nums = {3,30,34,5,9};
        assertEquals("3033459", buildMinimumNumberFromArray.minNumber(nums));
    }

    @Test
    public void test3(){
        int[] nums = {9,30,34,3,5};
        System.out.println(buildMinimumNumberFromArray.minNumber(nums));
        assertEquals("3033459", buildMinimumNumberFromArray.minNumber(nums));
    }
}
