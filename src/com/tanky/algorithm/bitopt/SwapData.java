package com.tanky.algorithm.bitopt;

/**
 * 不用额外的数交换两个数
 *
 * @author zhangzhongguo
 * @date 2022/05/24
 */
public class SwapData {

    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);

    }


}
