class Solution {
    public boolean isPalindrome(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int s = 0;
        int e = list.size() - 1;

        while (s < e) {
            if (!list.get(s).equals(list.get(e)))
                return false;

            s++;
            e--;
        }

        return true;
    }
}