package com.leetcode.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {
    MajorityElement majorityElement = new MajorityElement();

    @Test
    public void test1(){
        int[] nums = {3,2,3};
        assertEquals(3, majorityElement.majorityElement(nums));
    }

    @Test
    public void test3(){
        int[] nums = {3,3,4};
        assertEquals(3, majorityElement.majorityElement(nums));
    }

    @Test
    public void test2(){
        int[] nums = {2,2,1,1,1,2,2};
        assertEquals(2, majorityElement.majorityElement(nums));
    }

    @Test
    public void test4(){
        int[] nums = {6,5,5};
        assertEquals(5, majorityElement.majorityElement(nums));
    }
}
