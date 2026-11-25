package com.tanky.hot100.hash;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{-3, 4, 3, 90}, 0, new int[]{0, 2}),
                Arguments.of(new int[]{0, 4, 3, 0}, 0, new int[]{0, 3}),
                Arguments.of(new int[]{1, 3, 4, 2}, 6, new int[]{2, 3}),
                Arguments.of(new int[]{-1_000_000_000, 1_000_000_000}, 0, new int[]{0, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void returnsTwoDistinctIndicesInAnyOrder(int[] nums, int target, int[] expected) {
        int[] result = new TwoSum().twoSum(nums.clone(), target);
        assertNotNull(result, "应返回下标数组");
        assertEquals(2, result.length, "恰好返回两个下标");
        assertNotEquals(result[0], result[1], "不能重复使用同一元素");
        for (int index : result) {
            assertTrue(index >= 0 && index < nums.length, "下标必须有效");
        }
        assertEquals((long) target, (long) nums[result[0]] + nums[result[1]], "两数之和应等于 target");
        int[] sorted = result.clone();
        Arrays.sort(sorted);
        assertArrayEquals(expected, sorted, "下标顺序不限");
    }
}
