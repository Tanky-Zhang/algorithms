
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {


        int[] pw = new int[26];
        int[] window = new int[26];

        int sl = s.length();
        int pl = p.length();

        if (sl < pl) {
            return new ArrayList<Integer>();
        }

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < pl; i++) {
            pw[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pw, window)) {
            res.add(0);
        }

        for (int i = 0; i < sl - pl; i++) {
            window[s.charAt(i) - 'a']--;
            window[s.charAt(i + pl) - 'a']++;
            if (Arrays.equals(pw, window)) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
