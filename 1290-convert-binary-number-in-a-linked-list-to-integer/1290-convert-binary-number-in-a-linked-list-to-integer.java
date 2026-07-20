class Solution {
    public int getDecimalValue(ListNode head) {
        int num = 0;
        ListNode t = head;
        
        while (t != null) {
            num = num * 2 + t.val;
            t = t.next;
        }
        
        return num;
    }
}