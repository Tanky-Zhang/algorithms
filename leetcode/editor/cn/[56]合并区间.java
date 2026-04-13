
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();

        res.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            //当前元素
            int[] curr = intervals[i];
            //结果集中最后一个元素
            int[] arr = res.get(res.size() - 1);

            if (curr[0] > arr[1]) {
                res.add(curr);
            } else if (curr[1] > arr[1]) {
                arr[1] = curr[1];
            }

        }
        return res.toArray(new int[0][0]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
