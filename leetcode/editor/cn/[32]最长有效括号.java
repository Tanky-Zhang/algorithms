
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestValidParentheses(String s) {

        if (s.length() == 0) {
            return 0;
        }
        Deque<Integer> stack = new LinkedList<>();
        stack.push(-1);

        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.peek() != null) {
                    maxLen = Math.max(maxLen, i - stack.peek());
                } else {
                    //如果stack是空的，证明还未有合法的括号出现
                    stack.push(i);
                }
            }
        }

        return maxLen;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
