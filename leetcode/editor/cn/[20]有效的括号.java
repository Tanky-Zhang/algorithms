
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {

        if (s == null || s.length() == 0 || s.length() == 1) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (!stack.isEmpty()) {
                    Character c = stack.pop();
                    if (c != map.get(s.charAt(i))) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        //if (stack.isEmpty)
        return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
