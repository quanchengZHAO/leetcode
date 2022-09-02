package com.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DuplicateZerosTest {
    DuplicateZeros duplicateZeros = new DuplicateZeros();

    private void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test1(){
        int[] arr1 = null;
        duplicateZeros.duplicateZeros(arr1);
        printArray(arr1);
        int[] arr2 = new int[0];
        duplicateZeros.duplicateZeros(arr2);
        printArray(arr2);
        int[] arr3 = new int[]{1};
        duplicateZeros.duplicateZeros(arr3);
        printArray(arr3);
    }

    @Test
    public void test2(){
        int[] arr1 =new int[]{1, 0};
        duplicateZeros.duplicateZeros(arr1);
        printArray(arr1);
        int[] arr2 = new int[]{0, 0};
        duplicateZeros.duplicateZeros(arr2);
        printArray(arr2);
        int[] arr3 = new int[]{0, 1};
        duplicateZeros.duplicateZeros(arr3);
        printArray(arr3);
        int[] arr4 = new int[]{1, 0, 0};
        duplicateZeros.duplicateZeros(arr4);
        printArray(arr4);
    }
}
