package com.leetcode.array;

import org.junit.jupiter.api.Test;

public class RemoveElementTest {
    RemoveElement removeElement = new RemoveElement();

    @Test
    public void test(){
        int[] arr = new int[]{3,2,2,3};
        System.out.println(removeElement.removeElement(arr, 3));
    }
}
