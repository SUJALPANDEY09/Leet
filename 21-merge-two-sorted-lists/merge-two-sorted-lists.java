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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 == null && list2 != null){
            return list2;
        }
        if(list1 != null && list2 == null){
            return list1;
        }
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        while(cur1 != null && cur2 != null){
            if(cur1.val >= cur2.val){
                cur.next = new ListNode(cur2.val);
                cur = cur.next;
                cur2 = cur2.next;
            }
            else{
                cur.next = new ListNode(cur1.val);
                cur = cur.next;
                cur1 = cur1.next;
            } 
        }
        while(cur1 != null){
            cur.next = new ListNode(cur1.val);
            cur = cur.next;
            cur1 = cur1.next;
        }
        while(cur2 != null){
            cur.next = new ListNode(cur2.val);
            cur = cur.next;
            cur2 = cur2.next;
        }
        return ans.next;
    }
}