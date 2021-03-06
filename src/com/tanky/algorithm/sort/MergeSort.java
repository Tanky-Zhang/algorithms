package com.tanky.algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序实现
 *
 * @author zhangzhongguo
 * @date 2022/03/02
 */
public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        //申请辅助数组
        int[] temp = new int[arr.length];
        sort(arr, 0, 8, temp);

        System.out.println(Arrays.toString(arr));

    }


    public static void sort(int[] array, int start, int end, int[] temp) {
        //递归终止条件
        if (start < end) {
            //中点
            int mid = (start + end) / 2;
            sort(array, start, mid, temp);
            sort(array, mid + 1, end, temp);
            merge(array, start, mid, end, temp);
        }

    }

    public static void merge(int[] array, int start, int mid, int end, int[] temp) {

        //左侧数组的起始位置
        int i = start;
        //右侧数组的起始位置
        int j = mid + 1;
        //指向最终数据的索引位置
        int t = 0;

        while (i <= mid && j <= end) {
            //左侧较小
            if (array[i] <= array[j]) {
                temp[t++] = array[i++];
            } else {
                temp[t++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[t++] = array[i++];
        }

        while (j <= end) {
            temp[t++] = array[j++];
        }

        t = 0;
        int tempLeft = start;
        while (tempLeft <= end) {
            array[tempLeft++] = temp[t++];
        }

    }

}
