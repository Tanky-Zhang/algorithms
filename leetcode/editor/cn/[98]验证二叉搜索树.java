
//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    public boolean isValidBST(TreeNode node, TreeNode min, TreeNode max) {

        if (node == null) {
            return true;
        }

        if (min != null && min.val >= node.val) {
            return false;
        }

        if (max != null && max.val <= node.val) {
            return false;
        }

        return isValidBST(node.left, min, node) && isValidBST(node.right, node, max);

    }
}
//leetcode submit region end(Prohibit modification and deletion)
