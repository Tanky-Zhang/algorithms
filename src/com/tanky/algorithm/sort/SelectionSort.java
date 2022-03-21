package com.tanky.algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序实现
 *
 * @author zhangzhongguo
 * @date 2022/03/21
 */
public class SelectionSort {


    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    /**
     * 选择排序，不用额外的数组空间
     *
     * @param array
     */
    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            //保存最小的索引下标
            int minIndex = i;
            //保存最小的数值
            int minData = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (minData > array[j]) {
                    minData = array[j];
                    minIndex = j;
                }
            }
            //防止i本身即最小，然后做无用交换
            if (i != minIndex) {
                int tmp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = tmp;
            }

        }

    }


}
