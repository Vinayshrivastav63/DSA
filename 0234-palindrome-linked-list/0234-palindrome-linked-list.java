class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

        }
        ListNode first = head;
        ListNode sec = reverseList(slow);
        while(sec != null){
            if(sec.val != first.val) return false;
            first = first.next;
            sec = sec.next; 
        }
        return true;
        
    }
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode f = curr.next;
            curr.next = prev;
            prev = curr;
            curr = f;
        } 
        return prev;

    }
}