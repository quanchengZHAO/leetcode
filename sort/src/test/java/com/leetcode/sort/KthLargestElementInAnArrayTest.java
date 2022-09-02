package com.leetcode.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthLargestElementInAnArrayTest {
    KthLargestElementInAnArray kthLargestElementInAnArray = new KthLargestElementInAnArray();

    @Test
    public void test1(){
        int[] nums = {3,2,1,5,6,4};
        System.out.println(kthLargestElementInAnArray.findKthLargest(nums,2));
        assertEquals(5, kthLargestElementInAnArray.findKthLargest(nums,2));
    }

    @Test
    public void test2(){
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(kthLargestElementInAnArray.findKthLargest(nums,4));
        assertEquals(5, kthLargestElementInAnArray.findKthLargest(nums,4));

    }

    @Test
    public void test3(){
        int[] nums = {3,2,1,5,6,4};
        System.out.println(kthLargestElementInAnArray.findKthLargest(nums,4));
        assertEquals(3, kthLargestElementInAnArray.findKthLargest(nums,4));
    }

}
