package com.tanky.hot100.twopointers;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int r = 0, l = 0;
        int n = nums.length;
        while (r < n && l <= r) {
            if (nums[r] != 0) {
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
                r++;
                l++;
            } else {
                r++;
            }
        }
    }
}
