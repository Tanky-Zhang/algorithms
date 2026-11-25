package com.tanky.hot100.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrappingRainWaterTest {
    static Stream<Arguments> cases() {
        int[] wideBasin = new int[20_000];
        wideBasin[0] = 100_000;
        wideBasin[wideBasin.length - 1] = 100_000;
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, 6),
                Arguments.of(new int[]{4, 2, 0, 3, 2, 5}, 9),
                Arguments.of(new int[]{0}, 0),
                Arguments.of(new int[]{5}, 0),
                Arguments.of(new int[]{2, 1}, 0),
                Arguments.of(new int[]{3, 0, 3}, 3),
                Arguments.of(new int[]{3, 0, 1}, 1),
                Arguments.of(new int[]{2, 2, 2}, 0),
                Arguments.of(new int[]{0, 1, 2, 3}, 0),
                Arguments.of(new int[]{3, 2, 1, 0}, 0),
                Arguments.of(new int[]{2, 0, 2, 0, 2}, 4),
                Arguments.of(new int[]{5, 4, 1, 2}, 1),
                Arguments.of(wideBasin, 1_999_800_000)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void returnsTotalTrappedWater(int[] height, int expected) {
        assertEquals(expected, new TrappingRainWater().trap(height.clone()));
    }

    @ParameterizedTest
    @MethodSource("cases")
    void twoPointersReturnsTotalTrappedWater(int[] height, int expected) {
        assertEquals(expected, new TrappingRainWater().trapTwoPointers(height.clone()));
    }
}
