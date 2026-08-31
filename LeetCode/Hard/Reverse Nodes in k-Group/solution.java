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
    public ListNode reverseKGroup(ListNode head, int k) {
        
     if (head == null) {
        return null;
    }

    ListNode left = head;
    ListNode result = null;
    ListNode prevLeft = null;
    int size = k;

    while (true) {
        ListNode right = left;

        for (int i = 0; i < size - 1; i++) {
            if (right == null) {
                break;
            }
            right = right.next;
        }

        if (right == null) {
            if (prevLeft != null) {
                prevLeft.next = left;
            }

            if (result == null) {
                result = left;
            }

            break;
        }

        ListNode nextLeft = right.next;

        reverse(left, size);

        if (prevLeft != null) {
            prevLeft.next = right;
        }

        if (result == null) {
            result = right;
        }

        prevLeft = left;
        left = nextLeft;
    }
    return result;
    }
public void reverse(ListNode head, int times) {
    ListNode curr = head;
    ListNode prev = null;

    while (times-- > 0) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
}
}