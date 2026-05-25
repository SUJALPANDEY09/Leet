/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        HashMap<ListNode,Integer> hash = new HashMap<>();
        while(temp != null){
            if(hash.containsKey(temp)){
                return true;
            }
            hash.put(temp,1);
            temp = temp.next;
        } 
        return false;
    }
}