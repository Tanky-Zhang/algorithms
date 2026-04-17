
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int len = nums.length;

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            //一定是index-1的位置
            int index = (nums[i] - 1) % len;
            if (nums[index] <= len) {
                nums[index] += len;
            }
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] <= len) {
                res.add(i + 1);
            }
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
