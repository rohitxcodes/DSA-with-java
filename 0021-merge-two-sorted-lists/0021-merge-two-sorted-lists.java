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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        ListNode temp=list1;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=list2;
        
        return sort(list1);
    }
    public ListNode sort(ListNode list){
        if(list==null||list.next==null){
            return list;
        }
        
        ListNode mid=findMid(list);
        ListNode left=list;
        ListNode right=mid.next;
        mid.next=null;

        left=sort(left);
        right=sort(right);

        ListNode result=merge(left,right);
        return result;
    }
    public ListNode findMid(ListNode list){
        ListNode slow=list;
        ListNode fast=list.next;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode left,ListNode right){
        if(left==null) return right;
        if(right==null) return left;

        ListNode ans=new ListNode(-1);
        ListNode temp=ans;
        
        while(left!=null&& right!=null){
            if(left.val<right.val){
                temp.next=left;
                temp=left;
                left=left.next;
            }else{
                temp.next=right;
                temp=right;
                right=right.next;
            }
        }
        while (left!=null){
            temp.next=left;
            temp=left;
            left=left.next;
        }
        while (right!=null){
            temp.next=right;
            temp=right;
            right=right.next;
        }
        return ans.next;
    }
}