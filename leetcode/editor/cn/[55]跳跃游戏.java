
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canJump(int[] nums) {

        int n = nums.length;
        int maxStep = 0;
        //maxStep = nums[0];
        for (int i = 0; i < n; i++) {
            if (i <= maxStep) {
                maxStep = Math.max(maxStep, nums[i] + i);
                if (maxStep >= n - 1) {
                    return true;
                }
            }
        }
        return false;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
