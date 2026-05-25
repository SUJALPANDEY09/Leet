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
            hash.put(temp,hash.getOrDefault(temp,0)+1);
            if(hash.get(temp) == 2){
                return true;
            }
            temp = temp.next;
        } 
        return false;
    }
}