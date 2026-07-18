class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        while (prev.next != null && prev.next.next != null) {
            if (prev.next.val == prev.next.next.val) {
                int duplicateVal = prev.next.val;
                ListNode curr = prev.next;
                
                while (curr != null && curr.val == duplicateVal) {
                    curr = curr.next;
                }
                prev.next = curr;
            } else {
                prev = prev.next;
            }
        }
        
        return dummy.next;
    }
}