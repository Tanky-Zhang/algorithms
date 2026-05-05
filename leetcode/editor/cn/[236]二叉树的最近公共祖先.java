
//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return ans;
    }

    public boolean dfs(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return false;
        }

        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);

        if (lson && rson) {
            ans = root;
        }
        if ((lson || rson) && (root.val == p.val || root.val == q.val)) {
            ans = root;
        }

        return lson || rson || root.val == p.val || root.val == q.val;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
