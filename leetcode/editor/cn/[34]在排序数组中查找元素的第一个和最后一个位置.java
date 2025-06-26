
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {


    public int[] searchRange(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return new int[] {leftIdx, rightIdx};
        }
        return new int[] {-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1;
        int ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (lower) {
                if (nums[mid] >= target) {
                    right = mid - 1;
                    //符合条件，返回答案
                    ans = mid;
                } else {
                    left = mid + 1;
                    //ans = mid;
                }
            } else {
                if (nums[mid] > target) {
                    right = mid - 1;
                    ans = mid;
                } else {
                    left = mid + 1;
                    //ans = mid;
                }
            }
        }
        return ans;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
