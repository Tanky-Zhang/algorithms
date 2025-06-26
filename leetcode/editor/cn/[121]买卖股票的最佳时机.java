
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        int minCost = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minCost = Math.min(minCost, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minCost);
        }
        return maxProfit;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
