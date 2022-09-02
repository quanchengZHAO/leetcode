package com.leetcode.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RelativeRanksTest {
    RelativeRanks relativeRanks = new RelativeRanks();

    @Test
    public void test() {
        int[] score = {10, 3, 8, 9, 4};
        System.out.println(Arrays.toString(relativeRanks.findRelativeRanks(score)));
    }
}
