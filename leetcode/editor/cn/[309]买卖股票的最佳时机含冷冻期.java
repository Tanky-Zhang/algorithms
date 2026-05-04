
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {

        int[][] dp = new int[prices.length][3];

        //第一天持有一只股票
        dp[0][0] = -prices[0];
        //第一天不持有任何股票，且在冷冻期
        dp[0][1] = 0;
        //第一天不持有任何股票，且不在冷冻期
        dp[0][2] = 0;

        for (int i = 1; i < prices.length; i++) {

            //我们目前持有的这一支股票可以是在第 i−1 天就已经持有的，对应的状态为 f[i−1][0]；
            // 或者是第 i 天买入的，那么第 i−1 天就不能持有股票并且不处于冷冻期中
            dp[i][0] = Math.max(dp[i - 1][0], dp[i-1][2] - prices[i]);

            //前一天持有股票，且卖出
            dp[i][1] = dp[i - 1][0] + prices[i];

            //我们在第 i 天结束之后不持有任何股票并且不处于冷冻期，
            // 说明当天没有进行任何操作，即第 i−1 天时不持有任何股票
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1]);

        }

        return Math.max(dp[prices.length-1][1],dp[prices.length-1][2]);

    }
}
//leetcode submit region end(Prohibit modification and deletion)
