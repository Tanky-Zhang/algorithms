
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
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        //拉平左子树
        flatten(root.left);
        //拉平右子树
        flatten(root.right);

        //将右指针指向左子树
        TreeNode left = root.left;
        TreeNode right = root.right;

        root.right = left;
        root.left = null;

        //将没有遍历到的右子树，挂接到右子树的最右边,通过遍历的方式，早晚会遍历到这个节点
        TreeNode p = root;
        //先找到最右侧节点
        while (p.right != null) {
            p = p.right;
        }
        p.right = right;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
