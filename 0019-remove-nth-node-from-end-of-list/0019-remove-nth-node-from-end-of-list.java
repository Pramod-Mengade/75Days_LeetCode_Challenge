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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 1){
           return removeFromEnd(head);
        }

        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        if (count == n){
            return head.next;
        }

        if(count == 0 || count == 1){
            return null;
        }

        ListNode temp2 = head;
        int count2 = 0;

        while(count2 < count - n -1){
            temp2 = temp2.next;
            count2++;
        }

        temp2.next = temp2.next.next;

        return head;
    }

    public ListNode removeFromEnd(ListNode head){
        if (head == null || head.next == null) {
        return null;
        }
        ListNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    
}