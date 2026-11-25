package com.tanky.hot100.twopointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        // TODO：先说明容量计算方式和思路，再独立实现。
        //throw new UnsupportedOperationException("待独立实现：11. 盛最多水的容器");
        int ans = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {

            ans = Math.max(ans, Math.min(height[l], height[r]) * (r - l));

            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }

        }
        return ans;
    }
}
