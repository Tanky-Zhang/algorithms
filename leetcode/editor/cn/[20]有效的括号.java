
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {

        int len = s.length();

        Map<Character, Character> charMap = new HashMap<>();

        charMap.put(')', '(');
        charMap.put(']', '[');
        charMap.put('}', '{');
        //charMap.put(')','(');

        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < len; i++) {

            if (charMap.containsKey(s.charAt(i))) {
                if (stack.isEmpty()) {
                    return false;
                }
                Character ch = stack.pop();
                if (charMap.get(s.charAt(i)) != ch) {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }

        }
        return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
