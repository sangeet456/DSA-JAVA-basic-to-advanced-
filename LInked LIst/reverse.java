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
    public ListNode reverseList(ListNode head) {
        //base case--->>
        if(head==null || head.next==null) return head;
        //recursive work -->
        ListNode newhead=reverseList(head.next);
        head.next.next=head;//interchange the first element sign //selfwork//
        head.next = null;
        return newhead;
    }
}
