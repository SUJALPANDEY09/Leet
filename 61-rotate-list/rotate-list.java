/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = head;
        ListNode temp= head;
        if(head == null || head.next == null)return head;
        int len = 1;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        int rotate = k%len;
        if(rotate == 0) return head;
        tail.next = head;
        int count = 0;
        while(count < len - rotate - 1){
            temp = temp.next;
            count ++;
        }
        head = temp.next;
        temp.next= null;
        return head;
    }
}