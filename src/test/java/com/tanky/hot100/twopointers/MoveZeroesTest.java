package com.tanky.hot100.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}),
                Arguments.of(new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{7}, new int[]{7}),
                Arguments.of(new int[]{0, 0, 0}, new int[]{0, 0, 0}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 3}),
                Arguments.of(new int[]{0, 0, 1, 2}, new int[]{1, 2, 0, 0}),
                Arguments.of(new int[]{1, 2, 0, 0}, new int[]{1, 2, 0, 0}),
                Arguments.of(new int[]{0, -1, 0, -1, 2}, new int[]{-1, -1, 2, 0, 0}),
                Arguments.of(new int[]{0, Integer.MIN_VALUE, 0, Integer.MAX_VALUE},
                        new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void movesZeroesInPlacePreservingOrder(int[] input, int[] expected) {
        int[] nums = input.clone();
        new MoveZeroes().moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }
}
