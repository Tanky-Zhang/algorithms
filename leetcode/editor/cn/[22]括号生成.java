
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTrace(n, res, new StringBuilder(), 0, 0);
        return res;
    }

    private void backTrace(int n, List<String> res, StringBuilder tmpStr, int leftNum, int rightNum) {

        //base case
        if (tmpStr.length() == 2 * n) {
            res.add(tmpStr.toString());
            return;
        }

        //添加左括号
        if (leftNum < n) {
            tmpStr.append("(");
            backTrace(n, res, tmpStr, leftNum + 1, rightNum);
            tmpStr.deleteCharAt(tmpStr.length() - 1);
        }

        //添加右括号
        if (rightNum < leftNum) {
            tmpStr.append(")");
            backTrace(n, res, tmpStr, leftNum, rightNum + 1);
            tmpStr.deleteCharAt(tmpStr.length() - 1);
        }

    }

}
//leetcode submit region end(Prohibit modification and deletion)
