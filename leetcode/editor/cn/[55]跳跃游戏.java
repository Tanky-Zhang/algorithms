
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canJump(int[] nums) {

        int faIndex = 0;

        int len = nums.length;

        //len - 1 避免最后一步达不到的情况检测不到
        for (int i = 0; i < len - 1; i++) {

            faIndex = Math.max(faIndex, i + nums[i]);

            if (faIndex <= i) {
                return false;
            }

        }

        return faIndex >= len - 1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
