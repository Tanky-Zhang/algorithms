package com.tanky.algorithm.tree;

import com.tanky.structure.tree.TreeNode;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 树的遍历实现
 *
 * @author zhangzhongguo
 * @date 2022/03/14
 */
public class TreeTraverse {


    public static void main(String[] args) {

        //构建一棵树
        TreeNode head = new TreeNode(1);

        head.setLeft(new TreeNode(2));

        head.setRight(new TreeNode(3));

        head.getLeft().setLeft(new TreeNode(4));

        head.getLeft().setRight(new TreeNode(5));

        //调用前序遍历方法实现：1，2，4，5，3
        // frontSort(head);

        //调用中序遍历方法实现：4，2，5，1，3
        //midSort(head);

        //调用后序遍历方法实现：4，5，2，3，1
        //afterSort(head);

        //层序遍历实现
        levelSort(head);


    }


    /**
     * 前序遍历
     */
    private static void frontSort(TreeNode head) {
        //如果为null停止递归
        if (head == null) {
            return;
        }
        System.out.println(head.getData());
        frontSort(head.getLeft());
        frontSort(head.getRight());
    }

    /**
     * 中序遍历实现
     */
    private static void midSort(TreeNode head) {

        if (head == null) {
            return;
        }
        midSort(head.getLeft());
        System.out.println(head.getData());
        midSort(head.getRight());
    }

    /**
     * 后序遍历实现
     */
    private static void afterSort(TreeNode head) {

        if (head == null) {
            return;
        }
        afterSort(head.getLeft());
        afterSort(head.getRight());
        System.out.println(head.getData());

    }

    /**
     * 层序遍历实现
     */
    private static void levelSort(TreeNode head) {

        Queue<TreeNode> myQueue = new LinkedBlockingQueue<>();
        myQueue.add(head);

        while (!myQueue.isEmpty()) {

            TreeNode poll = myQueue.poll();
            System.out.println(poll.getData());

            //左右孩子入队
            if (poll.getLeft() != null) {
                myQueue.add(poll.getLeft());
            }

            if (poll.getRight() != null) {
                myQueue.add(poll.getRight());
            }

        }
    }

}
