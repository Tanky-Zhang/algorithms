package com.tanky.hot100.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4},
                        List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                Arguments.of(new int[]{0, 1, 1}, List.of()),
                Arguments.of(new int[]{0, 0, 0}, List.of(List.of(0, 0, 0))),
                Arguments.of(new int[]{0, 0, 0, 0}, List.of(List.of(0, 0, 0))),
                Arguments.of(new int[]{-2, 0, 0, 2, 2}, List.of(List.of(-2, 0, 2))),
                Arguments.of(new int[]{-1, -1, -1, 2, 2}, List.of(List.of(-1, -1, 2))),
                Arguments.of(new int[]{1, 2, 3}, List.of()),
                Arguments.of(new int[]{1, 1, 1}, List.of()),
                Arguments.of(new int[]{-1, -1, -1}, List.of()),
                Arguments.of(new int[]{-3, -2, -1}, List.of()),
                Arguments.of(new int[]{-100_000, 0, 100_000}, List.of(List.of(-100_000, 0, 100_000))),
                Arguments.of(new int[]{-4, -2, -2, 0, 2, 2, 4},
                        List.of(List.of(-4, 0, 4), List.of(-4, 2, 2),
                                List.of(-2, -2, 4), List.of(-2, 0, 2)))
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void returnsAllUniqueValueTriplets(int[] nums, List<List<Integer>> expected) {
        List<List<Integer>> result = new ThreeSum().threeSum(nums.clone());
        assertNotNull(result);
        for (List<Integer> triplet : result) {
            assertNotNull(triplet);
            assertEquals(3, triplet.size());
            List<Integer> remaining = new ArrayList<>();
            for (int num : nums) {
                remaining.add(num);
            }
            long sum = 0;
            for (Integer value : triplet) {
                assertNotNull(value);
                assertTrue(remaining.remove(value), "三元组必须来自三个不同位置");
                sum += value;
            }
            assertEquals(0L, sum);
        }
        // 保留重复三元组，确保重复结果会导致断言失败。
        assertEquals(normalize(expected), normalize(result));
    }

    private static List<List<Integer>> normalize(List<List<Integer>> triplets) {
        List<List<Integer>> normalized = new ArrayList<>();
        for (List<Integer> triplet : triplets) {
            List<Integer> copy = new ArrayList<>(triplet);
            copy.sort(Comparator.naturalOrder());
            normalized.add(copy);
        }
        normalized.sort(Comparator.<List<Integer>, Integer>comparing(t -> t.get(0))
                .thenComparing(t -> t.get(1)).thenComparing(t -> t.get(2)));
        return normalized;
    }
}
