package com.leetcode.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePairsTest {
    ReversePairs reversePairs = new ReversePairs();

    @Test
    public void test1(){
        int nums[]= {1,3,2,3,1};
        assertEquals(2, reversePairs.reversePairs(nums));
    }

    @Test
    public void test2(){
        int nums[]= {2,4,3,5,1};
        assertEquals(3, reversePairs.reversePairs(nums));
    }

    @Test
    public void test3(){
        int nums[]= {5,4,3,2,1};
        assertEquals(4, reversePairs.reversePairs(nums));
    }

    @Test
    public void test4(){
        int nums[]= {1,1,1,1,1};
        assertEquals(0, reversePairs.reversePairs(nums));
    }

    @Test
    public void test5(){
        int nums[]= {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        assertEquals(0, reversePairs.reversePairs(nums));
    }
}
