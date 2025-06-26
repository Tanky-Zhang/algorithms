
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        //排序
        Arrays.sort(nums);

        for (int first = 0; first < nums.length; first++) {
            if (first != 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            //int second = first + 1;
            int target = -nums[first];
            //右指针在最右侧开始移动
            int third = nums.length - 1;
            for (int second = first + 1; second < nums.length; second++) {
                if (second != first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                //如果第二个数字+第三个数字>target则需要将右侧指针往左移动
                while (second < third && nums[second] + nums[third] > target) {
                    third--;
                }
                //如果相等了，就可以停止整个循环？？
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    res.add(list);
                }
            }
        }

        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
