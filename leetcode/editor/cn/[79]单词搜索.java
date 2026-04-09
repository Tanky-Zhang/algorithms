
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean exist(char[][] board, String word) {
        int x = board.length;
        int y = board[0].length;

        //定义参观数组
        boolean[][] visited = new boolean[x][y];

        for (int m = 0; m < x; m++) {
            for (int n = 0; n < y; n++) {
                boolean res = check(visited, board, word, 0, m, n);
                if (res) {
                    return res;
                }
            }
        }

        return false;

    }

    public boolean check(boolean[][] visited, char[][] board, String word, int k, int start, int end) {

        if (board[start][end] != word.charAt(k)) {
            return false;
        }

        if (k == word.length() - 1) {
            return true;
        }

        visited[start][end] = true;

        int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        boolean result = false;

        //上下左右遍历
        for (int[] dir : direction) {

            int newStart = start + dir[0];
            int newEnd = end + dir[1];

            if (newStart >= 0 && newStart < board.length && newEnd >= 0 && newEnd < board[0].length) {
                if (!visited[newStart][newEnd]) {
                    boolean res = check(visited, board, word, k + 1, newStart, newEnd);
                    if (res) {
                        result = true;
                        break;
                    }
                }
            }
        }
        //为什么要设置成false
        visited[start][end] = false;
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
