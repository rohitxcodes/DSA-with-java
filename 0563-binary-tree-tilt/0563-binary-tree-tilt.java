/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
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

    int totalTilt = 0;

    public int findTilt(TreeNode root) {
        findTiltUtil(root);
        return totalTilt;
    }

    public int findTiltUtil(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftSum = findTiltUtil(root.left);
        int rightSum = findTiltUtil(root.right);

        totalTilt += Math.abs(leftSum - rightSum);

        return root.val + leftSum + rightSum;
    }
}