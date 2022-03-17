package com.tanky.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序实现
 *
 * @author zhangzhongguo
 * @date 2022/03/16
 */
public class InsertSort {


    public static void main(String[] args) {

        int[] arr = {1, 5, 9, 8, 7, 4, 5, 3, 6, 7};

        //简单插入排序
        //insertSort(arr);

        //折半插入排序
        halfInsertSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    /**
     * 思想就是拿出一个数来比大小，把它插入到合适的位置
     *
     * @param arr
     */
    private static void insertSort(int[] arr) {

        int tmp;
        int j;

        for (int i = 0; i < arr.length; i++) {

            tmp = arr[i];
            j = i;

            //当没有小于tmp的时候就继续往前遍历并且数据往后移动，判断条件的顺序不能变
            while (j > 0 && arr[j - 1] > tmp) {
                arr[j] = arr[j - 1];
                j--;
            }

            //可以减少移动次数
            if (j != i) {
                arr[j] = tmp;
            }
        }
    }

    /**
     * 插入排序的优化版本，折半插入
     * 思想：每次移动前通过折半查找出该数据应该插入的位置
     *
     * @param arr
     */
    private static void halfInsertSort(int[] arr) {
        int tmp;
        int j;
        int low;
        int high;

        for (int i = 0; i < arr.length; i++) {
            tmp = arr[i];
            j = i;
            low = 0;
            high = j;
            while (low <= high) {
                //找中点
                int mid = (low + high) / 2;
                if (arr[mid] > tmp) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            //开始移动数据
            for (; j > high; j--) {
                arr[j] = arr[j - 1];
            }

            if (i!=j) {
                arr[high] = tmp;
            }
        }

    }

}
