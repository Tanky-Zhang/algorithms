
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> tmpList = new ArrayList<>();
        dfs(tmpList, nums);
        return res;
    }

    public void dfs(List<Integer> tmpList, int[] nums) {
        //base case
        if (tmpList.size() == nums.length) {
            res.add(new ArrayList<>(tmpList));
            return;
        }

        for (int num : nums) {
            if (tmpList.contains(num)) {
                continue;
            }
            tmpList.add(num);
            dfs(tmpList, nums);
            tmpList.remove(tmpList.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
