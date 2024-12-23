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
    public void reorderList(ListNode head) {
        ListNode middle = findMiddle(head);
        ListNode list2 = reverse(middle.next);
        middle.next = null;
        merge(head, list2);
    }
    private ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode reverse(ListNode middle){
        ListNode prev = null;
        while(middle != null){
            ListNode temp = middle.next;
            middle.next = prev;
            prev = middle;
            middle = temp;
        }
        return prev;
    }
    private void merge(ListNode head, ListNode list2){
        ListNode list1 = head;
        while(list1 != null && list2 != null){
            ListNode temp1 = list1.next;
            ListNode temp2 = list2.next;
            list1.next = list2;
            list1 = temp1;
            list2.next = list1;
            list2 = temp2;
        }
    }
}