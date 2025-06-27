
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (map.get(key) == null) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            } else {
                List<String> list = map.get(key);
                list.add(str);
            }
        }
        return new ArrayList<>(map.values());

    }
}
//leetcode submit region end(Prohibit modification and deletion)
