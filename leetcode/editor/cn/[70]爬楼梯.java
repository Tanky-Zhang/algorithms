
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    int[] memo;

    public int climbStairs(int n) {
        //做一个记忆数组，否则时间超限
        memo = new int[n + 1];
        return dp(n);
    }

    public int dp(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        if (memo[n] != 0) {
            return memo[n];
        }


        memo[n] = dp(n - 1) + dp(n - 2);

        return memo[n];

    }


}
//leetcode submit region end(Prohibit modification and deletion)
