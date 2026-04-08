
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLen = 0;
        int currentNum = 0;
        int currentLen = 0;
        //fixme：这里要要用numSet，防止重复。重复以后最终结果没影响，但是会超时
        for (int num : numSet) {
            if (numSet.contains(num - 1)) {
                continue;
            }
            currentNum = num;
            currentLen = 1;
            while (numSet.contains(currentNum + 1)) {
                currentLen = currentLen + 1;
                currentNum = currentNum + 1;
            }
            maxLen = Math.max(maxLen, currentLen);
        }
        return maxLen;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
