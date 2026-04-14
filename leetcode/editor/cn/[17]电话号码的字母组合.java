
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    Map<Character, String> wordMap = new HashMap<>();

    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        // 2 abc 3 def 4 ghi 5 jkl 6 mno 7 pqrs 8 tuv 9 wxyz
        wordMap.put('2', "abc");
        wordMap.put('3', "def");
        wordMap.put('4', "ghi");
        wordMap.put('5', "jkl");
        wordMap.put('6', "mno");
        wordMap.put('7', "pqrs");
        wordMap.put('8', "tuv");
        wordMap.put('9', "wxyz");

        backTrace(digits, new StringBuilder(), 0);

        return res;

    }

    private void backTrace(String digits, StringBuilder stringBuilder, int startI) {

        //base case
        if (stringBuilder.length() == digits.length()) {
            res.add(stringBuilder.toString());
            return;
        }

        //for (int i = startI; i < digits.length(); i++) {

        Character ch = digits.charAt(startI);
        String letter = wordMap.get(ch);

        for (int j = 0; j < letter.length(); j++) {

            stringBuilder.append(letter.charAt(j));
            backTrace(digits, stringBuilder, startI + 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        }

    }


}
//leetcode submit region end(Prohibit modification and deletion)
