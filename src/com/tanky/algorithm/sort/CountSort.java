package com.tanky.algorithm.sort;

import java.util.Arrays;

/**
 * 计数排序的核心在于将输入的数据值转化为键存储在额外开辟的数组空间中。作为一种线性时间复杂度的排序，计数排序要求输入的数据必须是有确定范围的整数。
 *
 * @author zhangzhongguo
 * @date 2022/03/21
 */
public class CountSort {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 9, 3, 4, 1, 7, 2, 8};
        int[] ints = countSort(array);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 计数排序，可优化（找出最小值，然后只准备最小值和最大值之间的数组长度即可）
     *
     * @param array
     * @return
     */
    public static int[] countSort(int[] array) {

        int maxValue = getMax(array);
        int[] countArray = new int[maxValue + 1];
        //统计每个数据出现的次数
        for (int data : array) {
            countArray[data] = ++countArray[data];
        }

        int[] resultArray = new int[array.length];
        int m = 0;
        //进行遍历排序
        for (int i = 0; i < countArray.length; i++) {
            //每个元素出现的次数
            int times = countArray[i];
            if (times != 0) {
                while (times > 0) {
                    resultArray[m] = i;
                    m++;
                    times--;
                }
            }
        }
        return resultArray;
    }

    /**
     * 获取数组中的最大值
     *
     * @param array
     * @return
     */
    private static int getMax(int[] array) {

        int maxValue = array[0];
        for (int data : array) {
            if (data > maxValue) {
                maxValue = data;
            }
        }

        return maxValue;
    }

}
