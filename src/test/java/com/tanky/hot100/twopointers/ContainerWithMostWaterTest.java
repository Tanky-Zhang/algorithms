package com.tanky.hot100.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {
    static Stream<Arguments> cases() {
        int[] maximumSize = new int[100_000];
        Arrays.fill(maximumSize, 10_000);
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1),
                Arguments.of(new int[]{0, 0}, 0),
                Arguments.of(new int[]{1, 10}, 1),
                Arguments.of(new int[]{5, 5, 5, 5}, 15),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 6),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, 6),
                Arguments.of(new int[]{0, 5, 0, 0, 5, 0}, 15),
                Arguments.of(new int[]{8, 1, 1, 8}, 24),
                Arguments.of(maximumSize, 999_990_000)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void returnsMaximumCapacity(int[] height, int expected) {
        assertEquals(expected, new ContainerWithMostWater().maxArea(height.clone()));
    }
}
