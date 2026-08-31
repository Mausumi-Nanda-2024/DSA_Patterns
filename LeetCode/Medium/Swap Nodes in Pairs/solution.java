/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode swapPairs(ListNode head) {

        // If the list is empty, return head
        if (head == null) {
            return head;
        }

        ListNode left = head;
        ListNode right;

        // Stores the head of the final reversed list
        ListNode res = null;

        // Stores the tail of the previous reversed group
        ListNode prevleft = null;

        int size = 2;

        while (true) {

            // Start finding the last node of the current group
            right = left;

            // Move right (size - 1) times
            for (int i = 0; i < size - 1; i++) {

                if (right == null) {
                    break;
                }

                right = right.next;
            }

            // If a complete group of size 2 exists
            if (right != null) {

                // Save the first node of the next group
                ListNode nextLeft = right.next;

                // Reverse the current group
                reverse(left, size);

                // Connect previous reversed group
                // to the current reversed group
                if (prevleft != null) {
                    prevleft.next = right;
                }

                // After reversal, left becomes the tail
                // of the current reversed group
                prevleft = left;

                // The first reversed group's head
                // becomes the final result
                if (res == null) {
                    res = right;
                }

                // Move to the next group
                left = nextLeft;

            } else {

                // Less than 'size' nodes are remaining.
                // Do not reverse them.

                if (prevleft != null) {
                    prevleft.next = left;
                }

                // If no group was reversed,
                // the remaining node is the result.
                if (res == null) {
                    res = left;
                }

                break;
            }
        }

        return res;
    }


    // Reverse 'times' nodes starting from head
    public void reverse(ListNode head, int times) {

        ListNode curr = head;
        ListNode prev = null;

        while (times > 0) {

            // Save the next node
            ListNode next = curr.next;

            // Reverse the connection
            curr.next = prev;

            // Move prev forward
            prev = curr;

            // Move curr forward
            curr = next;

            // One node has been reversed
            times--;
        }
    }
}