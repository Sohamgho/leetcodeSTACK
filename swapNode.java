/*
link --> https://leetcode.com/problems/swap-nodes-in-pairs/
*/
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0); 
        dummyHead.next = head;
        ListNode current = dummyHead;
        
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            second.next = first;
            current.next = second;
            current = first;
        }
        
        return dummyHead.next;
    }
}
