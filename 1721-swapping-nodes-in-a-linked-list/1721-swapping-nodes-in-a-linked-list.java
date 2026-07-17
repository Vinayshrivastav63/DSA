
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        int len = 0;
        while(fast != null){
            fast = fast.next;
            len++;
        }
        
        fast = dummy;
        int i = 0;
        while(i < k){
            fast = fast.next;
            i++;
        }
        ListNode firstNode = fast;
     
        while(fast != null){
            fast = fast.next;
            slow = slow.next;

        }
        ListNode secondNode = slow;

        
        
        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;
        
        return dummy.next;
    }
}