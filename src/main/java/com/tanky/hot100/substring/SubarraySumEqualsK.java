package com.tanky.hot100.substring;

import java.util.*;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        // TODO：统计连续、非空子数组的个数，元素可能为负数。
        Map<Integer, Integer> prefixMap = new HashMap<>();

        prefixMap.put(0, 1);

        int ans = 0;

        int preSum = 0;

        for (int num : nums) {

            preSum += num;
            if (prefixMap.containsKey(preSum - k)) {
                ans = ans + prefixMap.get(preSum - k);
            }

            prefixMap.put(preSum, prefixMap.getOrDefault(preSum, 0) + 1);

        }
        return ans;

    }
}
