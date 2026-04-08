
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

    //key：inorder[i],value:i
    Map<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

    }

    public TreeNode buildTree(int[] preorder, int preorderStart, int preorderEnd, int[] inorder, int inorderStart,
            int inorderEnd) {

        if (preorderEnd < preorderStart || inorderEnd < inorderStart) {
            return null;
        }

        //开始计算
        int rootValue = preorder[preorderStart];

        int inorderRootIndex = inorderMap.get(rootValue);

        int leftSize = inorderRootIndex - inorderStart;

        int rightSize = inorderEnd - inorderRootIndex;

        TreeNode root = new TreeNode(rootValue);

        root.left =
                buildTree(preorder, preorderStart + 1, preorderStart + leftSize, inorder, inorderRootIndex - leftSize,
                        inorderRootIndex - 1);

        root.right = buildTree(preorder, preorderStart + leftSize + 1, preorderEnd, inorder, inorderRootIndex + 1,
                inorderEnd);

        return root;

    }

}
//leetcode submit region end(Prohibit modification and deletion)
