class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        
        ListNode i = head;
        ListNode j = head.next;
        
        while (j != null) {
            if (i.val != j.val) {
                i.next = j;
                i = i.next;
            }
            j = j.next;
        }
        i.next = null;
        
        return head;
    }
}