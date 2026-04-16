
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int max = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;

        int n = nums.length;
        int right = -1;

        //从左往右遍历寻找右边界
        for (int i = 0; i < n; i++) {
            if (nums[i] < max) {
                right=i;
            } else {
                max = nums[i];
            }
        }

        int left = -1;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > min) {
                left=i;
            } else {
                min = nums[i];
            }
        }

        return right == -1 ? 0 : right - left + 1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
