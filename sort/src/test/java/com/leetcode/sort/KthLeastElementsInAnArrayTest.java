package com.leetcode.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class KthLeastElementsInAnArrayTest {
    KthLeastElementsInAnArray kthLeastElementsInAnArray = new KthLeastElementsInAnArray();

    @Test
    public void test1(){
        int[] arr = {1,3,5,4,6,13,10,9,8,15,17};
        System.out.println(Arrays.toString(kthLeastElementsInAnArray.getLeastNumbers(arr, 4)));
    }

    @Test
    public void test2(){
        int[] arr = {5,1,1,2,0,0};
        //[1, 0, 1, 2, 5, 0]
        System.out.println(Arrays.toString(kthLeastElementsInAnArray.getLeastNumbers(arr, 4)));
    }
}
