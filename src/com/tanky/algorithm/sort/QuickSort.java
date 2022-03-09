package com.tanky.algorithm.sort;

import java.util.Arrays;

/**
 * 快速排序实现
 *
 * @author zhangzhongguo
 * @date 2022/03/09
 */
public class QuickSort {


    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 4, 9, 3, 4, 1, 7, 2, 8};

        quickSort(array, 0, 9);

        System.out.println(Arrays.toString(array));


    }


    private static void quickSort(int[] array, int start, int end) {

        int partition = partition(array, start, end);
        quickSort(array, start, partition - 1);
        quickSort(array, partition, end);

    }

    /**
     * 划分数组
     *
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static int partition(int[] array, int start, int end) {

        //找出基准值
        int m = array[start];

        int i = start+1;
        int j = end;

        while (i < j) {

            while (m > array[i] && i < j) {
                i++;
            }

            while (m < array[j] && i < j) {
                j--;
            }

            //大小值交换
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;

        }

        //走到i=j的部分,将值交换
        int index;
        if (m > array[i]) {
            array[start] = array[i];
            index = i;
        } else {
            array[start] = array[i - 1];
            index = i - 1;
        }
        array[index] = m;
        return i;
    }
}
