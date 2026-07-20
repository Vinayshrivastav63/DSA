class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode t = dummy;
        
        while (t.next != null && t.next.next != null) {
            ListNode first = t.next;
            ListNode second = t.next.next;
            
            first.next = second.next;
            second.next = first;
            t.next = second;
            
            t = first;
        }
        
        return dummy.next;
    }
}