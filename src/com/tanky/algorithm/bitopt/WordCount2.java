package com.tanky.algorithm.bitopt;

/**
 * 数组中有两种数出现了奇数次，其他都出现了偶数次，找到这两种数字
 *
 * @author zhangzhongguo
 * @date 2022/05/24
 */
public class WordCount2 {

    public static void main(String[] args) {


        int[] arr = new int[]{1, 4, 5, 1, 4, 5, 6, 6, 7, 7, 8, 8, 1, 4};

        int eor = 0;
        for (int num : arr) {
            eor ^= num;
        }
        //eor=a^b
        //提取出最右侧的1
        int onlyOne = eor & (-eor);
        int eor2 = 0;
        for (int num : arr) {
            if ((num & onlyOne) != 0) {
                eor2 ^= num;
            }
        }

        System.out.println(eor2 + "********" + (eor ^ eor2));

    }

}
