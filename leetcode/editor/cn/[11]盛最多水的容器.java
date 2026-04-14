
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {

        int left = 0;

        int right = height.length - 1;

        int maxArea = 0;

        while (left <= right) {

            int hei = Math.min(height[left], height[right]);

            int wid = right - left;

            maxArea = Math.max(maxArea, hei * wid);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }

        return maxArea;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
