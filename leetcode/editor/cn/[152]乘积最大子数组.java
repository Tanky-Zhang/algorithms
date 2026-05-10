
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProduct(int[] nums) {

        int len = nums.length;

        int[] dpMax = new int[len];

        int[] dpMin = new int[len];

        dpMax[0] = nums[0];
        dpMin[0] = nums[0];

        int max = dpMax[0];
        for (int i = 1; i < len; i++) {
            dpMax[i] = Math.max(Math.max(dpMax[i - 1] * nums[i], nums[i]), dpMin[i - 1] * nums[i]);
            dpMin[i] = Math.min(Math.min(dpMax[i - 1] * nums[i], nums[i]), dpMin[i - 1] * nums[i]);
            max = Math.max(max, dpMax[i]);
        }

        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
