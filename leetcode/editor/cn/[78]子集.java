//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    List<List<Integer>> res = new ArrayList<>();

    List<Integer> track = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backTrace(nums, 0);
        return res;
    }

    public void backTrace(int[] nums, int start) {

        res.add(new ArrayList<>(track));

        for (int i = start; i < nums.length; i++) {

            track.add(nums[i]);

            backTrace(nums, i+1);

            track.remove(track.size() - 1);

        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
