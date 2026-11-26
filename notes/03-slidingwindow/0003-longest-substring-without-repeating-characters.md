# 3. 无重复字符的最长子串 · 中等

来源：[力扣官方题目](https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/)，2026-11-26 核对。以下为题意转述。

返回字符串中不含重复字符的最长连续片段的长度。子串必须连续，不能跳过字符；答案是长度。

约束：0 ≤ s.length ≤ 100000；包含英文字母、数字、符号和空格。大小写是不同字符，空格也是字符。

"abcabcbb" → 3；"bbbbb" → 1；"pwwkew" → 3（"wke"，"pwke" 不连续）；"" → 0。

模板：src/main/java/com/tanky/hot100/slidingwindow/LongestSubstringWithoutRepeatingCharacters.java。
测试：src/test/java/com/tanky/hot100/slidingwindow/LongestSubstringWithoutRepeatingCharactersTest.java。
运行：mvn -Dtest=LongestSubstringWithoutRepeatingCharactersTest test。

12 组测试覆盖官方示例、空串、单字符、空格、非相邻重复、连续性、历史重复位置、大小写数字符号和最大长度。

## 本人思路与提示

本人提出重复时收缩左边界，并选择 Map 保存最近下标。经 abcb 和 abba 讨论，明确旧位置不在窗口内时不能回退左边界；更新 l=max(l,p+1)，长度为 r-l+1。

## 错误与复杂度

2026-11-26 13:10 +08:00：运行 mvn -Dtest=LongestSubstringWithoutRepeatingCharactersTest test，编译失败：缺少 Map、HashMap 导入，i、nums 未定义，maLen 与 maxLen 拼写不一致。JUnit 未执行，未修改算法代码。

静态审查：charAt 返回 char，Map 键应表达字符，建议 Character 而非 Integer；当前先 put 再查询会覆盖上次位置；get 可能为 null；内层只移动 r 而不更新各字符记录且可能走到 n 后继续访问；重复分支也可能不推进 r；l 未按 max(l,p+1) 更新。需统一为每轮处理一个字符，先查询旧下标并必要时调整 l，再保存当前下标、更新长度、推进 r。当前尚不能宣称 O(n)，应先解决正确性与终止问题。

## 通用思想与面试表达

2026-11-26 13:18 +08:00：改为单循环并保证 r 推进后，12 项测试 9 通过、3 失败，无错误或跳过。左边界更新仍错误：使用 r+1 和 s.charAt(l) 的旧位置，应基于原 l 与当前字符 s.charAt(r) 的旧位置 p+1；重复分支未保存最新下标，导致 Map 不能始终表示最近位置。外层 l<=r 是冗余约束，当前错误更新会触发提前结束。未修改学员算法代码，尚未完成首练。

2026-11-26 13:11 +08:00 复查：导入、Map 键类型与变量名已修正。编译通过，12 项测试中只有空串通过，11 项失败，均返回 0，无异常或跳过。

首轮推演：l=r=0，先将首字符及下标 0 存入 Map，内层查询立即命中，r 不动；随后 l=1，长度为 0；外层 l<=r 不成立直接结束。故所有非空输入返回 0。需按每轮处理 s.charAt(r) 的流程调整查询/保存顺序、去掉内层搜索循环、保证 r 每轮递增，并防止 l 回退。未修改学员算法代码。

2026-11-26 13:19 +08:00：运行 mvn -Dtest=LongestSubstringWithoutRepeatingCharactersTest test，12/12 通过，无失败、错误或跳过。未修改学员算法代码。

正确性：查询时 Map 保存此前最近位置，l=max(l,p+1) 排除旧重复且不回退，随后记录当前下标。合法窗口长度 r-l+1 更新最大值，每轮 r 递增。空串、空格、大小写、符号、历史重复位置与最大长度已测试。

复杂度：每个字符常数次平均 O(1) Map 操作，期望时间 O(n)，空间 O(min(n,字符集大小))。l<=r 在当前实现中恒成立，可仅保留 r<n；可自行删除过时注释、减少空行并保存当前字符以免重复 charAt。

面试表达：维护无重复连续窗口，Map 保存最近出现位置。遇到重复时将左边界推进到原左界与旧下标加一的较大值，再保存当前位置并更新最长长度。

多次提示后完成，不认定独立掌握。D+1/3/7/14：2026-11-27、2026-11-29、2026-12-03、2026-12-10。
