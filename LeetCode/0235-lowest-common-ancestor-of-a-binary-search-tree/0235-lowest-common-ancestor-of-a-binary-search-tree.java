/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //case 1 - p, q 각각 부모 노드를 기준으로 양 쪽으로 뻗어가는 경우 => 해당 부모 노드 리턴
        //case 2 - p, q 모두 한 방향으로 뻗어가는 경우 => case 1 or case 3
        //case 3 - 하나가 자손인 경우 => 바로 리턴

        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}