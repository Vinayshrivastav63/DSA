class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-2);
        ListNode t1 = d1;
        ListNode t2 = d2;
        ListNode t = head;
        
        boolean isOdd = true;
        
        while(t != null){
            if(isOdd){
                t1.next = t;
                t1 = t1.next;
            } else {
                t2.next = t;
                t2 = t2.next;
            }
            isOdd = !isOdd;
            t = t.next;
        }
        
        t2.next = null;
        t1.next = d2.next;
        
        return d1.next;
    }
}