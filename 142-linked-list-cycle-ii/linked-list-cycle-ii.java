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
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        int count = 0;
        HashMap<ListNode,Integer> hash = new HashMap<>();
        while(temp!= null){
            if(hash.containsKey(temp)){
                return temp;
            }
            hash.put(temp,1);
            temp = temp.next;
        }
        return null;
    }
}