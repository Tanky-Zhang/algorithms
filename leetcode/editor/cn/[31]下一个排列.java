
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public void nextPermutation(int[] nums) {

        //[1,2,3]
        //[1,3,2]
        int right = nums.length - 1; //右指针

        //找到第一个降序的位置
        int firstMin = -1;
        for (int i = right; i >= 1; i--) {
            if (nums[i - 1] < nums[i]) {
                firstMin = i - 1;
                break;
            }
        }

        //找到第一个大于firstMin的位置
        int firstMore = -1;
        if (firstMin!=-1) {
            for (int i = right; i >= 0; i--) {
                if (nums[firstMin] < nums[i]) {
                    firstMore = i;
                    break;
                }
            }
        }

        if (firstMore != -1 && firstMin != -1) {
            swap(nums, firstMin, firstMore);
        }

        reverse(nums, firstMin + 1, right);

    }

    private void swap(int[] nums, int i, int j) {

        int tmp = nums[i];

        nums[i] = nums[j];

        nums[j] = tmp;

    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)
