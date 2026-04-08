
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {

        int len = prices.length;

        //开一个dp数组
        int[][] dp = new int[len][2];
        //第一天只有两种情况，不操作/买入,可以初始化
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i<len; i++){
            //卖出，不操作，买入取最大值
            dp[i][0] = Math.max(dp[i - 1][1] + prices[i], dp[i - 1][0]);
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);

        }

        return dp[len - 1][0];

    }
}
//leetcode submit region end(Prohibit modification and deletion)
