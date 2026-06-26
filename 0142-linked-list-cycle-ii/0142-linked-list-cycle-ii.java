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
        int length=0;

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                ListNode temp=slow;
                do{
                    temp=temp.next;
                    length++;
                }while (temp!=slow);
                break;
            }
        }
        if(length==0) return null;
       ListNode f=head;
       ListNode s=head;
    
        while(length>0){
            f=f.next;
            length--;
        }
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return f;
    }
   
}