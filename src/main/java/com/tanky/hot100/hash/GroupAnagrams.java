package com.tanky.hot100.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (map.containsKey(key)) {
                List<String> value = map.get(key);
                value.add(str);
            } else {
                List<String> value = new ArrayList<>();
                value.add(str);
                map.put(key, value);
            }

        }
        return new ArrayList<>(map.values());
    }
}
