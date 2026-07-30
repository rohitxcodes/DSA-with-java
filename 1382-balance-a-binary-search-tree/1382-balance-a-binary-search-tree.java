/**
 * Definition for a binary tree Node.
 * public class TreeNode {
 *     int val;
 *      TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        return build(0,inorder.size()-1, inorder);

    }

    public static TreeNode build(int start, int end, ArrayList<Integer> inorder) {
        if (start > end) {
            return null;
        }
        int mid = start + (end -start ) / 2;
        TreeNode root = new TreeNode(inorder.get(mid));
        root.left = build(start, mid - 1, inorder);
        root.right = build(mid + 1, end, inorder);
        return root;
    }

    public static void getInorder(TreeNode root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.val);
        getInorder(root.right, inorder);
    }
}