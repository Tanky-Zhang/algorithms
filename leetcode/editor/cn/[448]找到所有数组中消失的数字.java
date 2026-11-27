
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int index = (nums[i] - 1) % n;
            if (nums[index] <= n) {
                nums[index] = nums[index] + n;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
