class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode t = dummy;
        
        while (t.next != null) {
            if (t.next.val == val) {
                t.next = t.next.next; 
            } else {
                t = t.next; 
            }
        }
        return dummy.next;
    }
}