package com.tanky.algorithm.tree;

/**
 * 树的节点实现
 *
 * @author zhangzhongguo
 * @date 2022/03/14
 */
public class TreeNode {

    int data;

    TreeNode left;

    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

}
