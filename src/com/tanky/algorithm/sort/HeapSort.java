package com.tanky.algorithm.sort;

import java.util.Arrays;

/**
 * 堆排序实现
 * [4,3,5,6,8,1,2,0,8,4]
 * n节点的左、右孩子节点分别是2n+1和2n+2
 *
 * @author zhangzhongguo
 * @date 2022/03/14
 */
public class HeapSort {

    public static void main(String[] args) {

        int[] arr = new int[]{10, 4, 1, 2, 1, 9, 4, 5, 3,10};
        //递归的排序
        heapSortWithRecursion(arr);
        System.out.println("递归堆排序后的数组为：" + Arrays.toString(arr));

    }

    /**
     * 递归堆排序
     *
     * @param arr 需要排序的数组
     */
    private static void heapSortWithRecursion(int[] arr) {


        // 先构建出一个大顶堆,从第一个父节点开始即可
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeapWithRecursion(arr, i, arr.length);
        }

        //从最后一层开始构建可以有效降低时间复杂度
        for (int i = arr.length - 1; i >= 0; i--) {
            //每次将最大值交换到最后
            swap(arr, 0, i);
            //每次对0～i-1的范围内的数据进行堆排序，因为i以及i之后的数据已经有序了
            adjustHeapWithRecursion(arr, 0, i);
        }

    }

    /**
     * 递归实现大顶堆的构建（自顶向下）
     *
     * @param arr    数组
     * @param index  所需要进行构建的起始位置（即每个子树的根节点）
     * @param length 当前需要构建的数组长度（实际数组长度可能要比这个数大）
     */
    private static void adjustHeapWithRecursion(int[] arr, int index, int length) {

        //先算出左子节点和右子节点的索引下标
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        //1.先判断是否超过索引下标，右节点坐标未超过，左节点一定没有超过
        if (rightChild < length) {
            //2.如果左子节点是大的
            if (arr[leftChild] > arr[rightChild] && arr[leftChild] > arr[index]) {
                swap(arr, index, leftChild);
                //3.以左子节点为根节点继续往下递归
                adjustHeapWithRecursion(arr, leftChild, length);
                //4.如果右子节点是大的
            } else if (arr[rightChild] >= arr[leftChild] && arr[rightChild] >= arr[index]) {
                swap(arr, index, rightChild);
                //5.以左子节点为根节点继续往下递归
                adjustHeapWithRecursion(arr, rightChild, length);
            }
            //6.如果只有左子节点，此时也不必递归，因为这是完全二叉树
        } else if (leftChild < length) {
            if (arr[leftChild] > arr[index]) {
                swap(arr, index, leftChild);
            }
        }

    }

    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    /**
     * 非递归堆排序
     *
     * @param arr
     */
    public static void heapSort(int arr[]) {

        //从后往前遍历
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

        for (int j = arr.length - 1; j > 0; j--) {
            swap(arr, 0, j);
            adjustHeap(arr, 0, j);
        }


    }


    /**
     * 非递归自顶向下构建大顶堆排序
     *
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap(int[] arr, int i, int length) {

        //存储的是最大值
        int temp = arr[i];
        //1.k = i * 2 + 1 这次循环是在提取最大值不断往树的根节点上放
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            //如果小于左子节点
            if (k + 1 < length && arr[k] < arr[k + 1]) {
                //那么接下来算右子节点
                k++;
            }
            //如果大于最大值就要交换
            if (arr[k] > temp) {
                //k所在的位置是比较大的，要将这个值提到i位置上？
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;
    }


    /**
     * 数组中两数交换方法
     *
     * @param arr
     * @param left
     * @param right
     */
    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
