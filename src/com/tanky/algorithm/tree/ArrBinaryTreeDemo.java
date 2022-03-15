package com.tanky.algorithm.tree;


class ArrBinaryTree {

    private int[] arr;

    public ArrBinaryTree(int[] arr) {
        this.arr = arr;
    }

    public void preOrder() {
        this.preOrder(0);
    }


    public void preOrder(int index) {
        if (arr == null || arr.length == 0) {
            //System.out.println("����Ϊ�գ����ܰ��ն�������ǰ�����");
        }
        System.out.println(arr[index]);
        if ((index * 2 + 1) < arr.length) {
            preOrder(2 * index + 1);
        }
        if ((index * 2 + 2) < arr.length) {
            preOrder(2 * index + 2);
        }
    }

}
