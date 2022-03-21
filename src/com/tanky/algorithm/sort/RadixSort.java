package com.tanky.algorithm.sort;

import java.util.Arrays;

/**
 * 基数排序
 *
 * @author zhangzhongguo
 * @date 2022/03/21
 */
public class RadixSort {

    public static void main(String[] args) {
        int[] array = new int[]{130, 1330, 400, 501, 309, 440, 1111, 711, 211, 811};
        radixSort(array, 10000);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 通过二维数组实现的基数排序
     *
     * @param array
     * @param digit 数组中的最大数字
     * @return
     */
    public static void radixSort(int[] array, int digit) {

        //获取数据的最大长度 例：100->3,1024->4
        int n = 10;

        //申请一个二维数组作为桶，存放所有的数据。共有十个桶
        int[][] bucket = new int[10][array.length];

        //用来存放每个桶中有多少个数据
        int[] orders = new int[10];

        while (digit >= n) {
            //放数据
            for (int j : array) {
                //取模
                int num = j % n / (n / 10);
                //将数据放入对应的桶
                bucket[num][orders[num]] = j;
                //该桶中的数据也对应增加1
                orders[num]++;
            }
            int t = 0;
            //取数据
            for (int i = 0; i < bucket.length; i++) {
                //只有该桶中有数据才会做处理
                if (orders[i] != 0) {
                    for (int m = 0; m < orders[i]; m++) {
                        array[t] = bucket[i][m];
                        t++;
                    }
                    orders[i] = 0;
                }

            }
            n *= 10;
        }
    }

}
