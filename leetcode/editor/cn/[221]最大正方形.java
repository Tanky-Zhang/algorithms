
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximalSquare(char[][] matrix) {

        int x = matrix.length;
        int y = matrix[0].length;

        int[][] dp = new int[x][y];

        int maxSide = Integer.MIN_VALUE;
        for (int m = 0; m < x; m++) {
            for (int n = 0; n < y; n++) {
                if (matrix[m][n] == '1') {
                    if (m == 0 || n == 0) {
                        dp[m][n] = 1;
                    } else {
                        dp[m][n] = Math.min(Math.min(dp[m - 1][n], dp[m][n - 1]), dp[m - 1][n - 1])+1;
                    }
                }
                maxSide = Math.max(maxSide, dp[m][n]);
            }
        }

        return maxSide * maxSide;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
