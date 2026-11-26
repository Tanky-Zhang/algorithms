package com.tanky.hot100.slidingwindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3),
                Arguments.of("", 0),
                Arguments.of("a", 1),
                Arguments.of(" ", 1),
                Arguments.of("abba", 2),
                Arguments.of("dvdf", 3),
                Arguments.of("tmmzuxt", 5),
                Arguments.of("abcde", 5),
                Arguments.of("aA1 !a", 5),
                Arguments.of("a".repeat(100_000), 1)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void returnsLongestContinuousUniqueLength(String s, int expected) {
        assertEquals(expected, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
    }
}
