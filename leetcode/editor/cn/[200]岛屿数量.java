
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numIslands(char[][] grid) {
        int xLen = grid.length;
        int yLen = grid[0].length;

        int numIslands = 0;

        for (int x = 0; x < xLen; x++) {
            for (int y = 0; y < yLen; y++) {
                if (grid[x][y] == '1') {
                    numIslands++;
                    dfs(grid, x, y);
                }
            }

        }
        return numIslands;

    }

    /**
     * 深度优先搜索遍历
     */
    public void dfs(char[][] grid, int x, int y) {

        int xLen = grid.length;
        int yLen = grid[0].length;

        if (x < 0 || y < 0 || x >= xLen || y >= yLen || grid[x][y] == '0') {
            return;
        }
        grid[x][y] = '0';
        //向四个方向递归
        dfs(grid, x + 1, y);
        dfs(grid, x - 1, y);
        dfs(grid, x, y + 1);
        dfs(grid, x, y - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
