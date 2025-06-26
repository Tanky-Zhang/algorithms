
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    List<String> res = new ArrayList<>();

    Map<Character, String> phoneMap = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return res;
        }
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        backtrack(digits, "", 0);

        return res;
    }

    private void backtrack(String digits, String str, int index) {
        if (index == digits.length()) {
            res.add(str);
            return;
        }
        char num = digits.charAt(index);
        String letter = phoneMap.get(num);
        for (int i = 0; i < letter.length(); i++) {
            backtrack(digits, str + letter.charAt(i), index + 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
