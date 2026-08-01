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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null){
            return null;
        }

        ListNode officer = head;
        ListNode cm = head.next;

        while(cm != null){
            if(officer.val != cm.val ){
                officer.next = cm;
                officer = officer.next;
            }

            cm = cm.next;
        }

        officer.next = null;
        return head;
        
    }
}