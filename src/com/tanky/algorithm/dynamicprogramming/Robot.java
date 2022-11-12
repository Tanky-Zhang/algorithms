package com.tanky.algorithm.dynamicprogramming;

/**
 * 假设有排成一行的N个位置记为1到N，N一定大于等于2
 * 开始时机器人在其中的M位置上，M一定是1到N中的一个
 * 如果机器人来到1位置那么下一步只能往右来到2位置
 * 如果机器人来到N位置那么下一步只能往左来到N-1的位置
 * 如果机器人来到中间位置，那么下一步可能向左走也可能向右走，
 * 规定机器人必须走K步，最终能来到P位置（P也是1～N中的一个）的方法有多少种
 *
 * @author zhangzhongguo
 * @date 2022/11/12
 */
public class Robot {


    public static void main(String[] args) {


        int[] nums = new int[]{1, 3, 5, 7, 9, 10};
        //使用递归
        System.out.println(way1(nums, 2, 1, 5));

        //使用动态规划
        int[][] dp = new int[nums.length][5 + 1];
        System.out.println(way2(dp, 2, 1, 5));


    }


    /**
     * 方法1：使用递归实现机器人走路
     *
     * @param nums       原数组
     * @param startIndex 开始的位置
     * @param aimIndex   机器人运动的目标位置
     * @param res        机器人运动的剩余步数
     * @return 可能的路径数量
     */
    public static int way1(int[] nums, int startIndex, int aimIndex, int res) {
        //base case
        if (res == 0) {
            if (aimIndex == startIndex) {
                return 1;
            } else {
                return 0;
            }
        }
        //分三种情况讨论
        if (startIndex == 0) {
            //开始位置在最左侧，只能向右移动
            return way1(nums, startIndex + 1, aimIndex, res - 1);
        }

        if (startIndex == nums.length - 1) {
            return way1(nums, startIndex - 1, aimIndex, res - 1);
        }

        return way1(nums, startIndex - 1, aimIndex, res - 1) + way1(nums, startIndex + 1, aimIndex, res - 1);
    }

    /**
     * 动态规划解题
     *
     * @param dp    动态规划数组
     * @param start 开始位置
     * @param aim   目标位置
     * @param res   剩余步数
     * @return
     */
    public static int way2(int[][] dp, int start, int aim, int res) {

        //初始化dp数组
        int m = dp.length;
        int n = dp[0].length;

        //base case
        for (int i = 0; i < m; i++) {
            if (i == aim) {
                dp[i][0] = 1;
            } else {
                dp[i][0] = 0;
            }
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (j == 0) {
                    //第一列的值是可以直接推出来的
                    if (i == aim) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 0;
                    }
                } else {
                    if (i == 0) {
                        //第一行依赖于第二行
                        dp[i][j] = dp[i + 1][j - 1];
                    } else if (i == m - 1) {
                        //最后一行依赖于倒数第二行
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        //普遍位置依赖于左上角节点和左下角节点相加
                        dp[i][j] = dp[i - 1][j - 1] + dp[i + 1][j - 1];
                    }

                }
            }
        }
        return dp[start][res];
    }


}
