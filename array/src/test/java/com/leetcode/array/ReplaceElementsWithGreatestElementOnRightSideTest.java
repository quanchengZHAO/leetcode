package com.leetcode.array;

import org.junit.jupiter.api.Test;

public class ReplaceElementsWithGreatestElementOnRightSideTest {
    ReplaceElementsWithGreatestElementOnRightSide r = new ReplaceElementsWithGreatestElementOnRightSide();

    @Test
    public void test1(){
        Helper.printArray(r.replaceElements(new int[]{17,18,5,4,6,1}));
    }

}
