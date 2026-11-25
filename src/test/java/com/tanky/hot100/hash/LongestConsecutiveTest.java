package com.tanky.hot100.hash;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[]{100, 4, 200, 1, 3, 2}, 4),
                Arguments.of(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}, 9),
                Arguments.of(new int[]{1, 0, 1, 2}, 3),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{5}, 1),
                Arguments.of(new int[]{2, 2, 2}, 1),
                Arguments.of(new int[]{-2, -3, -1, 0, 2}, 4),
                Arguments.of(new int[]{10, 30, 50}, 1),
                Arguments.of(new int[]{8, 7, 6, 5}, 4),
                Arguments.of(new int[]{1, 2, 10, 11, 12, 13}, 4),
                Arguments.of(new int[]{-1_000_000_000, -999_999_999, 999_999_999, 1_000_000_000}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void returnsLongestLength(int[] nums, int expected) {
        assertEquals(expected, new LongestConsecutive().longestConsecutive(nums.clone()));
    }
}
