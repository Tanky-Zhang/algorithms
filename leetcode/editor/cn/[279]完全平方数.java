
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSquares(int n) {

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minn = Math.min(minn, dp[i - j * j]);
            }
            dp[i] = minn + 1;
        }

        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
