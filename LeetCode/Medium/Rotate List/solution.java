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
    public ListNode rotateRight(ListNode head, int k) {

      // Edge Case: If the list is empty, return null immediately
        if (head == null) {
            return null; // [5, 6]
        }
        
        // Phase A: Calculate the total length (n) and find the last node in one go
        ListNode last = head;
        int n = 1; // [5, 6]
        
        // Traverse until 'last' points to the very last node (whose next is null)
        while (last.next != null) { // [6, 7]
            n++;
            last = last.next; // [6, 7]
        }
        
        // Phase B: Handle the modulo reset pattern for k >= n
        k = k % n; // [8-10]
        
        // If effective rotation is 0, no restructuring is needed
        if (k == 0) {
            return head; // [9, 10]
        }
        
        // Phase C: Locate the split point (the (n - k)th node)
        ListNode t = head;
        int count = 1; // [11, 12]
        
        while (t != null) {
            // Stop when we reach the node that will become the new tail
            if (count == n - k) { // [10, 11, 13, 14]
                break;
            }
            count++;
            t = t.next; // [10, 13]
        }
        
        // Phase D: Rearrange pointers and cut the list
        ListNode result = t.next; // The (n - k + 1)th node becomes our new head [14, 15]
        last.next = head;         // Form the temporary circle by connecting last to head [14, 15]
        t.next = null;            // Break the circle; t is now the new tail [14, 15]
        
        return result; // [14, 15]


        
    }
}