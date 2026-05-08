class Solution {

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return quickSelect(nums, 0, n - 1, n - k);
    }

    private int quickSelect(int[] nums, int left, int right, int k) {

        if (left == right) return nums[left];

        int pivot = nums[left];
        int i = left;
        int j = right;

        while (i < j) {

            while (i < j && nums[j] >= pivot) j--;
            while (i < j && nums[i] <= pivot) i++;

            if (i < j) swap(nums, i, j);
        }

        // ⭐关键：pivot 放到 j
        swap(nums, left, j);

        // ⭐关键：只用 j 划分
        if (k <= j) {
            return quickSelect(nums, left, j, k);
        } else {
            return quickSelect(nums, j + 1, right, k);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}