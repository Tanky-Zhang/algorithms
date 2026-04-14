
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //[3,2,4]
        //6
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i])) {
                if (i != numsMap.get(target - nums[i])) {
                    return new int[] {i, numsMap.get(target - nums[i])};
                }
            }
        }

        return new int[] {-1, -1};
    }
}
//leetcode submit region end(Prohibit modification and deletion)
