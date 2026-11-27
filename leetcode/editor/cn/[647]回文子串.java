
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int countSubstrings(String s) {

        int ans = 0;

        int n = s.length();

        for (int i = 0; i < 2 * n - 1; i++) {

            int l = i / 2;
            int r = i / 2 + i % 2;

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
                ans++;
            }

        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
