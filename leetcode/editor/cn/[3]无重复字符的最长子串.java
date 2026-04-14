
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        char[] chars = s.toCharArray();

        //set.add(chars[0]);

        int right = 0;

        int ans = 0;

        //左指针
        for (int i = 0; i < chars.length; i++) {
            // i右移时，移除旧字符
            if (i > 0) {
                set.remove(chars[i - 1]);
            }

            while (right < chars.length && !set.contains(chars[right])) {
                set.add(chars[right]);
                right++;
            }

            ans = Math.max(ans, right - i);
        }

        return ans;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
