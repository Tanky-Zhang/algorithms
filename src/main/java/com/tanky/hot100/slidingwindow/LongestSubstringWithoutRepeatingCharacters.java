package com.tanky.hot100.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        // TODO：子串必须连续，返回长度而非字符串。
        //throw new UnsupportedOperationException("待独立实现：3. 无重复字符的最长子串");
        Map<Character, Integer> wordMap = new HashMap<>();

        int l = 0;
        int r = 0;

        int n = s.length();

        int maxLen = 0;

        while (l <= r && r < n) {

            if (wordMap.containsKey(s.charAt(r))) {
                l = Math.max(l, wordMap.get(s.charAt(r)) + 1);
            }
            wordMap.put(s.charAt(r), r);

            maxLen = Math.max(r - l + 1, maxLen);

            r++;
        }

        return maxLen;

    }
}
