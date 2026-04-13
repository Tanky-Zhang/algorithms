
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {


    public int[] searchRange(int[] nums, int target) {

        int left = binarySearch(true, nums, target);
        int right = binarySearch(false, nums, target) - 1;

        if (left <= right && right < nums.length && nums[left] == target && nums[right] == target) {
            return new int[] {left, right};
        }

        return new int[] {-1, -1};

    }

    private int binarySearch(boolean lower, int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        int ans = nums.length;

        while (left <= right) {

            int mid = (left + right) / 2;

            if ((lower && nums[mid] >= target) || (!lower && nums[mid] > target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }

        }

        return ans;

    }

}
//leetcode submit region end(Prohibit modification and deletion)
