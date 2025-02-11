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

     public ListNode reverseHalf(ListNode head){
            if(head == null || head.next == null){
                return head;
            }
            ListNode newHead = reverseHalf(head.next);
            ListNode front = head.next;
            front.next = head;
            head.next = null;
            return newHead;
    }

    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newHead = reverseHalf(slow.next);
        ListNode first = head;
        ListNode second = newHead;
        while(second != null){
            if(first.val != second.val){
                reverseHalf(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseHalf(newHead);
        return true;
    }
}