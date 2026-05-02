
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPartition(int[] nums) {
<<<<<<< HEAD
        
=======

        int n = nums.length;
        if (n < 2) {
            return false;
        }

        int sum = 0;
        int maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;

        if (maxNum > target) {
            return false;
        }

        boolean[][] dp = new boolean[n][target + 1];

        for (int x = 0; x < n; x++) {
            dp[x][0] = true;
        }

        dp[0][nums[0]] = true;

        for (int x = 1; x < n; x++) {
            int curr = nums[x];
            for (int y = 1; y <= target; y++) {
                if (y >= curr) {
                    dp[x][y] = dp[x - 1][y - curr] | dp[x - 1][y];
                } else {
                    dp[x][y] = dp[x - 1][y];
                }
            }
        }

        return dp[n - 1][target];
>>>>>>> 9481d85a083a6873dfafb26b355f7cf8bac564d4
    }
}
//leetcode submit region end(Prohibit modification and deletion)
