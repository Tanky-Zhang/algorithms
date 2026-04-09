
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[][] memory;

    public int numTrees(int n) {
        memory = new int[n + 1][n + 1];
        return count(1, n);
    }

    public int count(int low, int high) {

        if (low >= high) {
            return 1;
        }

        if (memory[low][high] != 0) {
            return memory[low][high];
        }

        int res = 0;

        for (int mid = low; mid <= high; mid++) {

            int left = count(low, mid - 1);

            int right = count(mid + 1, high);

            res += left * right;

        }

        memory[low][high] = res;

        return res;


    }


}
//leetcode submit region end(Prohibit modification and deletion)
