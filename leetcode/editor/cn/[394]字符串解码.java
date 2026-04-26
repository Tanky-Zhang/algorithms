import java.util.Deque;
import java.util.LinkedList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    int ptr = 0;

    Deque<String> ans = new LinkedList<>();

    public String decodeString(String s) {

        while (ptr < s.length()) {

            char ch = s.charAt(ptr);

            if (Character.isDigit(ch)) {
                ans.push(contractDigit(s));
            } else if (Character.isLetter(ch) || ch == '[') {
                ans.push(String.valueOf(s.charAt(ptr++)));
            } else {
                ptr++;
                //右括号处理
                StringBuffer sb = new StringBuffer();
                while (!ans.peek().equals("[")) {
                    sb.insert(0, ans.pop());
                }
                //先弹出"["
                ans.pop();
                int repeat = Integer.parseInt(ans.pop());
                StringBuffer sb2 = new StringBuffer();
                for (int i = 1; i <= repeat; i++) {
                    sb2.append(sb);
                }
                ans.push(sb2.toString());

            }
        }
        StringBuilder result = new StringBuilder();

        while (!ans.isEmpty()) {
            result.insert(0, ans.pop());
        }

        return result.toString();
    }

    public String contractDigit(String s) {
        StringBuffer sb = new StringBuffer();
        while (Character.isDigit(s.charAt(ptr))) {
            sb.append(s.charAt(ptr++));
        }
        return sb.toString();
    }

}
//leetcode submit region end(Prohibit modification and deletion)
