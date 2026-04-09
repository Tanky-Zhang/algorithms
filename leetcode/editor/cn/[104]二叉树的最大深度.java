
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

    int deepth = 0;

    int maxDeep = 0;

    public int maxDepth(TreeNode root) {

        //核心：前序遍历就是深度优先搜索遍历
        preorder(root);
        return maxDeep;

    }

    public void preorder(TreeNode node) {

        if (node == null) {
            return;
        }

        deepth++;

        if (node.left == null || node.right == null) {
            maxDeep = Math.max(maxDeep, deepth);
        }

        preorder(node.left);
        preorder(node.right);

        // 后序遍历位置（离开节点）减少深度
        deepth--;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
