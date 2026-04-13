
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minPathSum(int[][] grid) {

        int x = grid.length;
        int y = grid[0].length;

        int[][] dp = new int[x][y];

        dp[0][0] = grid[0][0];
        for (int i = 1; i < x; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < y; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        for (int m = 1; m < x; m++) {
            for (int n = 1; n < y; n++) {
                dp[m][n] = Math.min(dp[m - 1][n], dp[m][n - 1]) + grid[m][n];
            }
        }

        return dp[x - 1][y - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
