package com.tanky.hot100.hash;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"},
                        List.of(List.of("eat", "tea", "ate"), List.of("tan", "nat"), List.of("bat"))),
                Arguments.of(new String[]{""}, List.of(List.of(""))),
                Arguments.of(new String[]{"a"}, List.of(List.of("a"))),
                Arguments.of(new String[]{"", "", "a"}, List.of(List.of("", ""), List.of("a"))),
                Arguments.of(new String[]{"ab", "ab", "ba"}, List.of(List.of("ab", "ab", "ba"))),
                Arguments.of(new String[]{"ab", "aab", "abb", "bba"},
                        List.of(List.of("ab"), List.of("aab"), List.of("abb", "bba"))),
                Arguments.of(new String[]{"a", "b", "c"}, List.of(List.of("a"), List.of("b"), List.of("c"))),
                Arguments.of(new String[]{"a".repeat(100), "a".repeat(99) + "b", "b" + "a".repeat(99)},
                        List.of(List.of("a".repeat(100)), List.of("a".repeat(99) + "b", "b" + "a".repeat(99))))
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void groupsAnagramsIgnoringOrderButPreservingDuplicates(String[] strs, List<List<String>> expected) {
        List<List<String>> result = new GroupAnagrams().groupAnagrams(strs.clone());
        assertNotNull(result);
        for (List<String> group : result) {
            assertNotNull(group);
            assertFalse(group.isEmpty(), "不能出现空分组");
            for (String word : group) {
                assertNotNull(word);
            }
        }
        assertEquals(normalize(expected), normalize(result));
    }

    private static List<List<String>> normalize(List<List<String>> groups) {
        List<List<String>> normalized = new ArrayList<>();
        for (List<String> group : groups) {
            List<String> copy = new ArrayList<>(group);
            copy.sort(Comparator.naturalOrder());
            normalized.add(copy);
        }
        // 输入仅含小写字母，此分隔符不会出现在单词中；保留重复项。
        normalized.sort(Comparator.comparing(group -> String.join("\u0001", group)));
        return normalized;
    }
}
