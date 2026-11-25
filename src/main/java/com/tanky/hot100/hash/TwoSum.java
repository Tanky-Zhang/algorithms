package com.tanky.hot100.hash;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //定义一个map，key是对应的值，value是对应的下标
        //一次遍历，往map中放值同时同时在map中获取target-num[i]，如果能获取到直接返回

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] {-1, -1};
    }

}
