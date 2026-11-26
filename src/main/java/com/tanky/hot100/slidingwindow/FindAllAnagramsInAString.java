package com.tanky.hot100.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        int m = s.length();
        int n = p.length();

        List<Integer> ans = new ArrayList<>();

        if (m < n) {
            return ans;
        }

        int[] pArray = new int[26];

        for (char c : p.toCharArray()) {
            pArray[c - 'a']++;
        }

        int[] sArray = new int[26];

        for (int i = 0; i < n; i++) {
            sArray[s.charAt(i) - 'a']++;
        }


        // 先检查第一个完整窗口，等长字符串也能在这里匹配。
        if (Arrays.equals(pArray, sArray)) {
            ans.add(0);
        }

        int l = 0;
        int r = n; // 当前窗口为 [l, r)，r 指向下一个移入的字符。

        while (r < m) {
            sArray[s.charAt(l) - 'a']--;
            sArray[s.charAt(r) - 'a']++;
            l++;
            r++;

            // 移动后检查新窗口，包含最后一个窗口。
            if (Arrays.equals(pArray, sArray)) {
                ans.add(l);
            }
        }

        return ans;

    }
}
