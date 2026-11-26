package com.tanky.hot100.substring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarraySumEqualsKTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1}, 2, 2),
                Arguments.of(new int[]{1, 2, 3}, 3, 2),
                Arguments.of(new int[]{3}, 3, 1),
                Arguments.of(new int[]{1}, 0, 0),
                Arguments.of(new int[]{0}, 0, 1),
                Arguments.of(new int[]{0, 0, 0}, 0, 6),
                Arguments.of(new int[]{1, -1, 0}, 0, 3),
                Arguments.of(new int[]{-1, -1, 1}, -1, 3),
                Arguments.of(new int[]{1, 4, -2}, 3, 1),
                Arguments.of(new int[]{1, 2}, 100, 0),
                Arguments.of(new int[]{3, 4, 7, 2, -3, 1, 4, 2}, 7, 4),
                Arguments.of(new int[20_000], 0, 200_010_000)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void countsAllNonemptyContinuousSubarrays(int[] nums, int k, int expected) {
        assertEquals(expected, new SubarraySumEqualsK().subarraySum(nums.clone(), k));
    }
}
