
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;

        Deque<Integer> stack = new LinkedList<>();

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int curr = stack.pop();
                ans[curr] = i - curr;
            }

            stack.push(i);

        }

        return ans;


    }
}
//leetcode submit region end(Prohibit modification and deletion)
