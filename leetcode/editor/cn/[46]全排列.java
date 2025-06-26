
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();
        for (int num : nums) {
            combine.add(num);
        }
        dfs(res, combine, nums, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> combine, int[] nums, int start) {

        //base case
        if (start == nums.length) {
            res.add(new ArrayList<>(combine));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            // 动态维护数组
            Collections.swap(combine, start, i);
            //combine.add(nums[i]);
            // 继续递归填下一个数
            dfs(res, combine, nums, start + 1);
            // 撤销操作
            Collections.swap(combine, start, i);
            //combine.remove(combine.size()-1);
        }


    }
}
//leetcode submit region end(Prohibit modification and deletion)
