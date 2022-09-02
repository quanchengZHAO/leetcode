package com.leetcode.sort;

import org.junit.jupiter.api.Test;

public class InsertionSortListTest {

    InsertionSortList insertionSortList = new InsertionSortList();

    @Test
    public void test1(){
        InsertionSortList.ListNode node1 = new InsertionSortList.ListNode(4);
        InsertionSortList.ListNode node2 = new InsertionSortList.ListNode(2);
        InsertionSortList.ListNode node3 = new InsertionSortList.ListNode(1);
        InsertionSortList.ListNode node4 = new InsertionSortList.ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(insertionSortList.insertionSortList(node1).val);

    }

}
