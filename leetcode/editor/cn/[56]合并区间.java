
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {

        //排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int size = list.size();
            if (size == 0 || list.get(size - 1)[1] < intervals[i][0]) {
                list.add(new int[] {intervals[i][0], intervals[i][1]});
            } else {
                //list.add(new int[]{intervals[i][0], Math.max()});
                list.get(size - 1)[1] = Math.max(list.get(size - 1)[1], intervals[i][1]);
            }

        }

        return list.toArray(new int[list.size()][]);


    }
}
//leetcode submit region end(Prohibit modification and deletion)
