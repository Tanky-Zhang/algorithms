package com.tanky.algorithm.sort;

import java.util.Arrays;

/**
 * 希尔排序实现
 *
 * @author zhangzhongguo
 * @date 2022/03/21
 */
public class ShellSort {


    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 4, 9, 3, 4, 1, 7, 2, 8};
        shellSort(array);
        System.out.println(Arrays.toString(array));

    }

    /**
     * 希尔排序实现
     *
     * @param array
     */
    public static void shellSort(int[] array) {
        int length = array.length;
        //每次分组内的数据量，例如：length=15 第一次分组是分两组一组7个一组8个，第二次分组是分5组一组是三个数据......
        for (int step = length / 2; step >= 1; step /= 2) {
            for (int i = step; i < length; i++) {
                //默认将tmp作为最大的值，如果有比他大的就往后移动
                int tmp = array[i];
                int j = i - step;
                while (j >= 0 && array[j] > tmp) {
                    //将较大的数据交换到后边的分组中去
                    array[j + step] = array[j];
                    j -= step;
                }
                //将tmp放在最前边的分组，因为通过比较所有的比他大的数据已经往后移动了
                array[j + step] = tmp;
            }
        }
    }
}
