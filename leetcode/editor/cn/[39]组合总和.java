
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        //返回结果
        List<List<Integer>> res = new ArrayList<>();
        //保存当前已经选择的数字列表
        List<Integer> combine = new ArrayList<>();

        dfs(candidates, 0, target, res, combine);

        return res;

    }


    public void dfs(int[] candidates, int index, int target, List<List<Integer>> res,
            List<Integer> combine) {
        if (index == candidates.length) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(combine));
            return;
        }
//        //不选择当前数字
//        dfs(candidates, index + 1, target, res, combine);
//        //选择当前数字
//        if (target - candidates[index] >= 0) {
//            combine.add(candidates[index]);
//            dfs(candidates, index, target - candidates[index], res, combine);
//            combine.remove(combine.size() - 1);
//        }

        for (int i = index; i < candidates.length; i++) {
            if (target - candidates[i] < 0) continue;
            combine.add(candidates[i]);
            dfs(candidates, i, target - candidates[i], res, combine); // 注意这里是 i，不是 i+1，因为可以重复
            combine.remove(combine.size() - 1); // 回溯
        }

    }

}
//leetcode submit region end(Prohibit modification and deletion)
