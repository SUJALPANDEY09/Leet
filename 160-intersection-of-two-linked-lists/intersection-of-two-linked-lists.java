/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> hash = new HashMap<>();
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != null){
            hash.put(temp1,1);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            if(hash.containsKey(temp2)){
                return temp2;
            }
            temp2 = temp2.next;
        }
        return null;
    }
}