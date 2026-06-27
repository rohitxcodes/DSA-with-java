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
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null || k <= 1) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;

        while (true) {


            ListNode temp = curr;
            for (int i = 0; i < k; i++) {
                if (temp == null) {
                    return head;
                }
                temp = temp.next;
            }

            ListNode last = prev;
            ListNode newEnd = curr;

            ListNode nextNode = curr.next;

          
            for (int i = 0; curr != null && i < k; i++) {
                curr.next = prev;
                prev = curr;
                curr = nextNode;

                if (nextNode != null) {
                    nextNode = nextNode.next;
                }
            }

      
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

        
            newEnd.next = curr;

            
            prev = newEnd;
        }
    }
}