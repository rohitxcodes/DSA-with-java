/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {

    public Node flatten(Node head) {
        if (head == null) return null;

        flattenList(head);

        return head;
    }

    private Node flattenList(Node curr) {

        Node last = curr;

        while (curr != null) {

            Node next = curr.next;

            if (curr.child != null) {

                Node child = curr.child;

                Node childLast = flattenList(child);

                // Connect curr -> child
                curr.next = child;
                child.prev = curr;

                // Remove child pointer
                curr.child = null;

                // Connect flattened child -> original next
                childLast.next = next;

                if (next != null) {
                    next.prev = childLast;
                }

                last = childLast;

            } else {
                last = curr;
            }

            // Continue with the original next node
            curr = next;
        }

        return last;
    }
}