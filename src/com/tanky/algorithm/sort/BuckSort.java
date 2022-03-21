package com.tanky.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 桶排序实现
 *
 * @author zhangzhongguo
 * @date 2022/03/21
 */
public class BuckSort {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 4, 9, 3, 4, 1, 7, 2, 8};
        buckSort(array);
        System.out.println(Arrays.toString(array));
    }


    /**
     * 桶排序
     *
     * @param arr
     */
    public static void buckSort(int[] arr) {

        //找出数组中的最大元素和最小元素
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        //计算桶的个数
        int length = (max - min) / arr.length + 1;

        //为了计算简单此处不再使用二维数组，直接采用list嵌套list的形式来进行存储

        List<ArrayList<Integer>> arrayLists = new ArrayList<>(length);

        //开始构建length个桶
        for (int j = 0; j < length; j++) {
            arrayLists.add(new ArrayList<>());
        }

        // 将每个元素放入桶
        for (int i = 0; i < arr.length; i++) {
            int num = (arr[i] - min) / (arr.length);
            arrayLists.get(num).add(arr[i]);
        }

        // 对每个桶进行排序
        for (int i = 0; i < arrayLists.size(); i++) {
            Collections.sort(arrayLists.get(i));
        }

        // 将桶中的元素赋值到原序列
        int index = 0;
        for (int i = 0; i < arrayLists.size(); i++) {
            for (int j = 0; j < arrayLists.get(i).size(); j++) {
                arr[index++] = arrayLists.get(i).get(j);
            }
        }

    }
}
