
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

    List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        //        inorder(root);
        //        return res;
        return inorderIterate(root);
    }

    /**
     * 递归写法
     */
    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }

    /**
     * 迭代写法
     */
    public List<Integer> inorderIterate(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        Deque<TreeNode> deque = new ArrayDeque<>();

        TreeNode current = root;
        while (current != null || !deque.isEmpty()) {

            //找到最左边的节点
            while (current != null) {
                deque.push(current);
                current = current.left;
            }

            current = deque.pop();

            res.add(current.val);

            current = current.right;

        }

        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
