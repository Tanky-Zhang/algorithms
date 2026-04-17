
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> integerMap = new HashMap<>();

        integerMap.put(0, 1); // 关键初始化

        int count = 0;

        int preSum = 0;

        for (int num : nums) {

            preSum = preSum + num;


            if (integerMap.containsKey(preSum - k)) {
                count += integerMap.get(preSum - k);
            }


            integerMap.put(preSum, integerMap.getOrDefault(preSum, 0) + 1);

        }

        return count;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
