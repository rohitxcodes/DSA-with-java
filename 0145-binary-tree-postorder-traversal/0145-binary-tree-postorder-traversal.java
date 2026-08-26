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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> li=new ArrayList<>();
        if(root==null) return new ArrayList<Integer>();
        return postorderTraversalUtil(root,li);
    }
    public List<Integer> postorderTraversalUtil(TreeNode root, ArrayList<Integer> li) {
        if(root==null){
            return null;
        }
        postorderTraversalUtil(root.left,li);
        postorderTraversalUtil(root.right,li);
        li.add(root.val);
        return li;
    }
}