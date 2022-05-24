package com.tanky.algorithm.bitopt;

/**
 * 把一个int类型的数字最右侧的1提取出来
 * 原始：111000010
 * 结果：000000010
 *
 * @author zhangzhongguo
 * @date 2022/05/24
 */
public class ExtractOne {

    public static void main(String[] args) {
        int a =9;
        System.out.println(a & (~a + 1));
        System.out.println(a & (-a));
    }

}
