package com.tanky.hot100.hash;

import java.util.Set;
import java.util.HashSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        // TODO：先描述思路及如何满足 O(n)，再独立实现。
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int ans = 0;
        for (int num : numSet) {
            if (numSet.contains(num - 1)) {
                continue;
            }
            int tmpNum = num;
            int tmpAns = 0;
            while (numSet.contains(tmpNum)) {
                tmpNum = tmpNum + 1;
                tmpAns++;
            }
            ans = Math.max(ans, tmpAns);
        }

        return ans;

    }
}
