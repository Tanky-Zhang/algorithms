
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {

        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        int maxStart = 0;
        int maxEnd = 0;

        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 1; i < s.length(); i++) {

            for (int j = 0; j < i; j++) {

                if (s.charAt(i) == s.charAt(j) && (i - j<= 2 || dp[j+1][i - 1])) {

                    dp[j][i] = true;

                    if (i - j + 1 > maxLen) {
                        maxLen = i-j + 1;
                        maxStart = j;
                        maxEnd = i;
                    }

                }

            }

        }

        return s.substring(maxStart, maxEnd + 1);

    }
}
//leetcode submit region end(Prohibit modification and deletion)
