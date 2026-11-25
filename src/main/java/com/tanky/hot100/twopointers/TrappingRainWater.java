package com.tanky.hot100.twopointers;

public class TrappingRainWater {
    /**
     * 双指针版本：时间 O(n)，额外空间 O(1)。
     */
    public int trapTwoPointers(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;

        // 每轮结算一个位置，包含最后相遇的位置。
        while (l <= r) {
            leftMax = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);

            if (leftMax <= rightMax) {
                // 右侧已有足够高的柱子，左侧最高值决定当前位置水位。
                ans += leftMax - height[l];
                l++;
            } else {
                // 左侧已有足够高的柱子，右侧最高值决定当前位置水位。
                ans += rightMax - height[r];
                r--;
            }
        }

        return ans;
    }

    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {

            ans += Math.min(leftMax[i], rightMax[i]) - height[i];

        }

        return ans;


    }
}
