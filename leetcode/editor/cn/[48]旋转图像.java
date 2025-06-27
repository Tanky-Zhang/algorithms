
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        //按照副对角线翻转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][n - 1 - i];
                matrix[n - 1 - j][n - 1 - i] = tmp;
            }
        }

        //按照中间上下翻转
        int mid = m / 2;
        for (int i = 0; i < mid; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = temp;
            }
        }


    }
}
//leetcode submit region end(Prohibit modification and deletion)
