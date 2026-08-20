class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];
        Stack<Integer> st = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            for (int j = 0; j < nums1.length; j++) {
                if (nums1[j] == nums2[i]) {
                    ans[j] = st.isEmpty() ? -1 : st.peek();
                }
            }

            st.push(nums2[i]);
        }

        return ans;
    }
}