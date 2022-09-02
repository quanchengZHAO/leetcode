package com.leetcode.sort;

public class InsertionSortList {

    /**
     * 147 Medium
     * <p>
     * Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.
     * <p>
     * The steps of the insertion sort algorithm:
     * <p>
     * Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
     * At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
     * It repeats until no input elements remain.
     * The following is a graphical example of the insertion sort algorithm. The partially sorted list (black) initially contains only the first element in the list. One element (red) is removed from the input data and inserted in-place into the sorted list with each iteration.
     *
     *
     * Result:
     * Runtime: 5 ms, faster than 82.51% of Java online submissions for Insertion Sort List.
     * Memory Usage: 44.6 MB, less than 55.73% of Java online submissions for Insertion Sort List.
     * @param head
     * @return
     */
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode current = head;
        ListNode next = head.next;

        while (next != null) {
            if (current.val <= next.val) {
                current = current.next; // current one is less then the next one
                next = current.next;
            } else {
                // Iterates the whole list to find the position
                ListNode previous = dummy;
                while (previous.next.val <= next.val) {
                    previous = previous.next;
                }
                current.next = next.next;
                next.next = previous.next;
                previous.next = next;

                next = current.next;
            }
        }
        return dummy.next;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
