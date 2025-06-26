
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void nextPermutation(int[] nums) {

        int min = -1;
        int max = 0;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                min = i;
                break;
            }
        }

        if (min >= 0) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[min] < nums[i]) {
                    max = i;
                    break;
                }
            }
            //swap
            swap(nums, min, max);
        }
        int start = min + 1;
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
