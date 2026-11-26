package com.tanky.hot100.slidingwindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramsInAStringTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of("cbaebabacd", "abc", List.of(0, 6)),
                Arguments.of("abab", "ab", List.of(0, 1, 2)),
                Arguments.of("a", "aa", List.of()),
                Arguments.of("baa", "aab", List.of(0)),
                Arguments.of("abb", "aab", List.of()),
                Arguments.of("aaaa", "aa", List.of(0, 1, 2)),
                Arguments.of("abc", "d", List.of()),
                Arguments.of("abac", "a", List.of(0, 2)),
                Arguments.of("zzabc", "bca", List.of(2)),
                Arguments.of("abxaba", "ab", List.of(0, 3, 4)),
                Arguments.of("a".repeat(30_000), "a".repeat(30_000), List.of(0))
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void returnsAllStartIndicesInAnyOrder(String s, String p, List<Integer> expected) {
        List<Integer> result = new FindAllAnagramsInAString().findAnagrams(s, p);
        assertNotNull(result);
        for (Integer index : result) {
            assertNotNull(index);
            assertTrue(index >= 0 && index <= s.length() - p.length());
        }
        List<Integer> sorted = new ArrayList<>(result);
        sorted.sort(Integer::compareTo);
        // 保留重复下标，重复返回会使断言失败。
        assertEquals(expected, sorted);
    }
}
