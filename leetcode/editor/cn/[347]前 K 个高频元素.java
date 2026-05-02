
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> numCountMap = new HashMap<>();

        for (int num : nums) {
            numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
        }

        //构建小顶堆，int[0]代表数字，int[1]代表数量
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        for (Map.Entry<Integer, Integer> entry : numCountMap.entrySet()) {

            int key = entry.getKey();
            int vaule = entry.getValue();

            if (queue.size() == k) {
                if (queue.peek()[1] < vaule) {
                    queue.poll();//弹出堆顶部元素
                    queue.offer(new int[] {key, vaule});
                }
            } else {
                queue.offer(new int[] {key, vaule});
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll()[0];
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
