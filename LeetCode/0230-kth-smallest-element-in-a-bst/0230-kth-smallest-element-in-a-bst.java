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
    private int nodeNum = 0;
    private int resultValue = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return resultValue;
    }

    private void inorder(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        inorder(root.left, k);
        nodeNum++;
        if (nodeNum == k) {
            resultValue = root.val;
        }
        inorder(root.right, k);
    }
}