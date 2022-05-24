package com.tanky.algorithm.bitopt;

/**
 * 一个数组中一种数字出现了奇数次，其他都出现了偶数次。找出奇数次的数字
 *
 * @author zhangzhongguo
 * @date 2022/05/24
 */
public class WordCount {


    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 1, 3, 4, 5, 4, 3, 2, 5, 4};

        int eor = 0;

        for (int num : arr) {

            eor=eor ^ num;

        }
        System.out.println(eor);
    }

}
