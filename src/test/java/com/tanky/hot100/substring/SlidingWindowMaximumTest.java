package com.tanky.hot100.substring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SlidingWindowMaximumTest {
    static Stream<Arguments> cases() {
        int[] increasing = new int[100_000];
        int[] decreasing = new int[100_000];
        for (int i = 0; i < increasing.length; i++) {
            increasing[i] = i / 10;
            decreasing[i] = 10_000 - i / 10;
        }
        return Stream.of(
                Arguments.of(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3, new int[]{3, 3, 5, 5, 6, 7}),
                Arguments.of(new int[]{1}, 1, new int[]{1}),
                Arguments.of(new int[]{2, -1, 3}, 1, new int[]{2, -1, 3}),
                Arguments.of(new int[]{1, 3, 2}, 3, new int[]{3}),
                Arguments.of(new int[]{1, 2, 3, 4}, 2, new int[]{2, 3, 4}),
                Arguments.of(new int[]{4, 3, 2, 1}, 2, new int[]{4, 3, 2}),
                Arguments.of(new int[]{2, 2, 2, 2}, 2, new int[]{2, 2, 2}),
                Arguments.of(new int[]{-4, -2, -5, -1}, 2, new int[]{-2, -2, -1}),
                Arguments.of(new int[]{9, 1, 2, 3}, 2, new int[]{9, 2, 3}),
                Arguments.of(new int[]{5, 5, 1, 2}, 2, new int[]{5, 5, 2}),
                Arguments.of(new int[]{-10_000, 10_000, -10_000}, 2, new int[]{10_000, 10_000}),
                Arguments.of(increasing, 50_000, java.util.Arrays.copyOfRange(increasing, 49_999, 100_000)),
                Arguments.of(decreasing, 50_000, java.util.Arrays.copyOfRange(decreasing, 0, 50_001))
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void returnsMaximumForEveryWindowInOrder(int[] nums, int k, int[] expected) {
        assertArrayEquals(expected, new SlidingWindowMaximum().maxSlidingWindow(nums.clone(), k));
    }
}
