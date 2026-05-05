
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        return fun2(nums);
    }

    //不节省空间做法
    //    public int[] fun1(int[] nums) {
    //
    //        //定义三个数组，左侧乘积，右侧乘积，最后结果
    //        int n = nums.length;
    //        int[] L = new int[n];
    //        int[] R = new int[n];
    //
    //        int[] ans = new int[n];
    //
    //        L[0] = 1;
    //
    //        for (int i = 1; i < n; i++) {
    //            L[i] = L[i - 1] * nums[i-1];
    //        }
    //
    //        R[n - 1] = 1;
    //        for (int i = n - 2; i >= 0; i--) {
    //            R[i] = R[i + 1] * nums[i+1];
    //        }
    //
    //        for (int i = 0; i < n; i++) {
    //            ans[i] = L[i] * R[i];
    //        }
    //
    //        return ans;
    //
    //
    //    }

    //节省空间做法
    public int[] fun2(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        ans[0] = 1;

        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int r = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * r;
            r *= nums[i];
        }

        return ans;

    }


}
//leetcode submit region end(Prohibit modification and deletion)
