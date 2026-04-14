
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> tmpList = new ArrayList<>();

        dfs(0, candidates, target, tmpList, 0);

        return res;

    }

    public void dfs(int start, int[] candidates, int target, List<Integer> tmpList, int tmpSum) {

        if (tmpSum == target) {
            res.add(new ArrayList<>(tmpList));
            return;
        } else if (tmpSum > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            tmpSum += candidates[i];

            tmpList.add( candidates[i]);

            dfs(i, candidates, target, tmpList, tmpSum);

            tmpSum -=  candidates[i];

            tmpList.remove(tmpList.size() - 1);

        }

    }

}
//leetcode submit region end(Prohibit modification and deletion)
