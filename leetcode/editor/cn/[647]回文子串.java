
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int countSubstrings(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            //非常坑的点，就是奇数和偶数要分开讨论
            ans += expand(s, i, i);     // 奇数回文
            ans += expand(s, i, i + 1); // 偶数回文
        }

        return ans;
    }

    private int expand(String s, int l, int r) {
        int count = 0;

        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            count++;
            l--;
            r++;
        }

        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
