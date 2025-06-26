
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        //left 代表已经处理好的
        int left = 0;
        //right 代表待处理的
        int right = 0;
        while (right < nums.length) {
            //如果待处理的不为0就交换
            if (nums[right] != 0) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
            }
            right++;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
