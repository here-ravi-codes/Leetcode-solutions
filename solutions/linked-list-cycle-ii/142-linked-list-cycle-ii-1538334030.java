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
        // HashMap<ListNode,Integer> map = new HashMap<>();
        // ListNode temp = head;
        // int index = 0;
        // while(temp != null && temp.next != null){
        //     if(map.containsKey(temp)){
        //         return temp;
        //     }
        //     map.put(temp, index);
        //     index++;
        //     temp = temp.next;
        // }
        // return null;


        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}