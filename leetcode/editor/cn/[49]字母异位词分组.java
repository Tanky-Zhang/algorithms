
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        Map<String, List<String>> wordMap = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            if (wordMap.containsKey(key)) {
                wordMap.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                wordMap.put(key, list);
            }

        }

        return new ArrayList<>(wordMap.values());

    }
}
//leetcode submit region end(Prohibit modification and deletion)
