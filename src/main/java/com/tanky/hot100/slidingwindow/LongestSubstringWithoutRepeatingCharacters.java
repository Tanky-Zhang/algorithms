package com.tanky.hot100.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        // TODO：子串必须连续，返回长度而非字符串。
        //throw new UnsupportedOperationException("待独立实现：3. 无重复字符的最长子串");
        int n = s.length();
        int l = 0;
        int r = 0;

        int ans = 0;

        Map<Character, Integer> countMap = new HashMap<>();

        while (l <= r && r < n) {

            if (countMap.containsKey(s.charAt(r))) {

                int index = countMap.get(s.charAt(r));

                l = Math.max(l, index + 1);

            }

            countMap.put(s.charAt(r), r);
            ans = Math.max(ans, r - l + 1);
            r++;


        }

        return ans;


    }
}
