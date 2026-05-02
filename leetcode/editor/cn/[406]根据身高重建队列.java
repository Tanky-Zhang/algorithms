import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] reconstructQueue(int[][] people) {

        //按照身高从高到低，身高相同按照个数从小到大
        Arrays.sort(people, (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o2[0] - o1[0];
            } else {
                return o1[1] - o2[1];
            }
        });

        List<int[]> ans = new ArrayList<>();

        for (int[] peo : people) {
            ans.add(peo[1], peo);
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
