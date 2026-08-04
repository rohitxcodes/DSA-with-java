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
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<count-n-1;i++){
            temp=temp.next;
        }
        if (n == count) {
            return head.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}