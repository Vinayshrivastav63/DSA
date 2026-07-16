/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        Node temp = head;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        int mid = len/2;
        temp = head;
        for(int i = 0; i < mid; i++){
            temp = temp.next;
        }
        return temp.data;
    }
}