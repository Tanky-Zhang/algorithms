# Hot 100 训练进度

当前交接（2026-11-27）：到期口述复习已记录，3的提示后编码复现12/12通过，总次数2；239正在编码、当前编译失败，未完成，累计仍10/100。跨设备继续先读[HANDOFF.md](HANDOFF.md)。

最新状态（2026-11-26 21:00）：六道 D+1 口述检查已记录，今日完成3、438、560，累计覆盖10/100（非全部独立完成）。560在前缀和计数提示后自行编码通过，下一题239。11月27日到期复习1、3、438、560。

来源：[力扣官方新版 Hot 100](https://leetcode.cn/studyplan/top-100-liked/)，核对日期：2026-11-24（Asia/Shanghai）。17 个专题、100 道不重复题目；专题及题目顺序与官方一致。结构化快照见 [curriculum/hot100.json](curriculum/hot100.json)。

L0：没有思路；L1：阅读题解后能够理解；L2：能够独立实现；L3：能够快速实现、解释并解决变形题。
初始统一标为 L0（待评估），不代表已经测评。练习次数按完成的编码练习轮次统计，同一轮中的修改与复查不重复计次；口述、初始化和运行空模板不计编码次数。提示情况另记，测试通过不自动代表独立掌握。

截至 2026-11-25 22:00，首练通过 7/100。今天完成 49、128、283、11、15、42，基础 4 道新题目标已完成，额外 5 道加练已完成 2 道，下一题为 3. 无重复字符的最长子串。月度安排见 [PLAN.md](PLAN.md)，交接见 [notes/sessions.md](notes/sessions.md)。

今日训练已结束。未完成加练 3、438、560 顺延，不计完成；11 月 26 日先复习上述六题。接雨水 O(1) 空间版本及三数之和优化由教练在明确授权后提供，不增加编码次数或掌握等级。

复习规则：以首次完成日 D 为基准，安排 D+1、D+3、D+7、D+14 天（自然日，Asia/Shanghai）；最近练习时间在实际练习后更新，下一次复习填尚未完成的最早节点，逾期保留原日期。复习后记录结果并推进节点；第 14 天后根据掌握程度商定下一轮。未完成首练不预填日期。每次记录在 notes/reviews.md，不能用一次复习覆盖整轮计划。

## 01. 哈希

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- |------| --- | --- | --- |
| 1 | [两数之和](https://leetcode.cn/problems/two-sum/) | 简单 | L2   | 1 | 2026-11-27（口述） | 2026-12-01 |
| 49 | [字母异位词分组](https://leetcode.cn/problems/group-anagrams/) | 中等 | L0（待确认，建议 L2） | 1 | 2026-11-26（口述） | 2026-11-28 |
| 128 | [最长连续序列](https://leetcode.cn/problems/longest-consecutive-sequence/) | 中等 | L0（待复习评估） | 1 | 2026-11-26（口述） | 2026-11-28 |

## 02. 双指针

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 283 | [移动零](https://leetcode.cn/problems/move-zeroes/) | 简单 | L0（待复习评估） | 1 | 2026-11-26（口述） | 2026-11-28 |
| 11 | [盛最多水的容器](https://leetcode.cn/problems/container-with-most-water/) | 中等 | L0（待复习评估） | 1 | 2026-11-26（口述） | 2026-11-28 |
| 15 | [三数之和](https://leetcode.cn/problems/3sum/) | 中等 | L0（待复习评估） | 1 | 2026-11-26（口述） | 2026-11-28 |
| 42 | [接雨水](https://leetcode.cn/problems/trapping-rain-water/) | 困难 | L0（待复习评估） | 1 | 2026-11-26（口述） | 2026-11-28 |

## 03. 滑动窗口

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 3 | [无重复字符的最长子串](https://leetcode.cn/problems/longest-substring-without-repeating-characters/) | 中等 | L0（提示后复现，待独立评估） | 2 | 2026-11-27 14:34 +08:00 | 2026-11-29 |
| 438 | [找到字符串中所有字母异位词](https://leetcode.cn/problems/find-all-anagrams-in-a-string/) | 中等 | L0（教练纠正，待独立复现） | 1 | 2026-11-27（口述） | 2026-11-29 |

## 04. 子串

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 560 | [和为 K 的子数组](https://leetcode.cn/problems/subarray-sum-equals-k/) | 中等 | L0（待独立复现评估） | 1 | 2026-11-27（口述） | 2026-11-29 |
| 239 | [滑动窗口最大值](https://leetcode.cn/problems/sliding-window-maximum/) | 困难 | L0 | 0 | — | — |
| 76 | [最小覆盖子串](https://leetcode.cn/problems/minimum-window-substring/) | 困难 | L0 | 0 | — | — |

## 05. 普通数组

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 53 | [最大子数组和](https://leetcode.cn/problems/maximum-subarray/) | 中等 | L0 | 0 | — | — |
| 56 | [合并区间](https://leetcode.cn/problems/merge-intervals/) | 中等 | L0 | 0 | — | — |
| 189 | [轮转数组](https://leetcode.cn/problems/rotate-array/) | 中等 | L0 | 0 | — | — |
| 238 | [除了自身以外数组的乘积](https://leetcode.cn/problems/product-of-array-except-self/) | 中等 | L0 | 0 | — | — |
| 41 | [缺失的第一个正数](https://leetcode.cn/problems/first-missing-positive/) | 困难 | L0 | 0 | — | — |

## 06. 矩阵

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 73 | [矩阵置零](https://leetcode.cn/problems/set-matrix-zeroes/) | 中等 | L0 | 0 | — | — |
| 54 | [螺旋矩阵](https://leetcode.cn/problems/spiral-matrix/) | 中等 | L0 | 0 | — | — |
| 48 | [旋转图像](https://leetcode.cn/problems/rotate-image/) | 中等 | L0 | 0 | — | — |
| 240 | [搜索二维矩阵 II](https://leetcode.cn/problems/search-a-2d-matrix-ii/) | 中等 | L0 | 0 | — | — |

## 07. 链表

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 160 | [相交链表](https://leetcode.cn/problems/intersection-of-two-linked-lists/) | 简单 | L0 | 0 | — | — |
| 206 | [反转链表](https://leetcode.cn/problems/reverse-linked-list/) | 简单 | L0 | 0 | — | — |
| 234 | [回文链表](https://leetcode.cn/problems/palindrome-linked-list/) | 简单 | L0 | 0 | — | — |
| 141 | [环形链表](https://leetcode.cn/problems/linked-list-cycle/) | 简单 | L0 | 0 | — | — |
| 142 | [环形链表 II](https://leetcode.cn/problems/linked-list-cycle-ii/) | 中等 | L0 | 0 | — | — |
| 21 | [合并两个有序链表](https://leetcode.cn/problems/merge-two-sorted-lists/) | 简单 | L0 | 0 | — | — |
| 2 | [两数相加](https://leetcode.cn/problems/add-two-numbers/) | 中等 | L0 | 0 | — | — |
| 19 | [删除链表的倒数第 N 个结点](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/) | 中等 | L0 | 0 | — | — |
| 24 | [两两交换链表中的节点](https://leetcode.cn/problems/swap-nodes-in-pairs/) | 中等 | L0 | 0 | — | — |
| 25 | [K 个一组翻转链表](https://leetcode.cn/problems/reverse-nodes-in-k-group/) | 困难 | L0 | 0 | — | — |
| 138 | [随机链表的复制](https://leetcode.cn/problems/copy-list-with-random-pointer/) | 中等 | L0 | 0 | — | — |
| 148 | [排序链表](https://leetcode.cn/problems/sort-list/) | 中等 | L0 | 0 | — | — |
| 23 | [合并 K 个升序链表](https://leetcode.cn/problems/merge-k-sorted-lists/) | 困难 | L0 | 0 | — | — |
| 146 | [LRU 缓存](https://leetcode.cn/problems/lru-cache/) | 中等 | L0 | 0 | — | — |

## 08. 二叉树

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 94 | [二叉树的中序遍历](https://leetcode.cn/problems/binary-tree-inorder-traversal/) | 简单 | L0 | 0 | — | — |
| 104 | [二叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-binary-tree/) | 简单 | L0 | 0 | — | — |
| 226 | [翻转二叉树](https://leetcode.cn/problems/invert-binary-tree/) | 简单 | L0 | 0 | — | — |
| 101 | [对称二叉树](https://leetcode.cn/problems/symmetric-tree/) | 简单 | L0 | 0 | — | — |
| 543 | [二叉树的直径](https://leetcode.cn/problems/diameter-of-binary-tree/) | 简单 | L0 | 0 | — | — |
| 102 | [二叉树的层序遍历](https://leetcode.cn/problems/binary-tree-level-order-traversal/) | 中等 | L0 | 0 | — | — |
| 108 | [将有序数组转换为二叉搜索树](https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/) | 简单 | L0 | 0 | — | — |
| 98 | [验证二叉搜索树](https://leetcode.cn/problems/validate-binary-search-tree/) | 中等 | L0 | 0 | — | — |
| 230 | [二叉搜索树中第 K 小的元素](https://leetcode.cn/problems/kth-smallest-element-in-a-bst/) | 中等 | L0 | 0 | — | — |
| 199 | [二叉树的右视图](https://leetcode.cn/problems/binary-tree-right-side-view/) | 中等 | L0 | 0 | — | — |
| 114 | [二叉树展开为链表](https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/) | 中等 | L0 | 0 | — | — |
| 105 | [从前序与中序遍历序列构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | 中等 | L0 | 0 | — | — |
| 437 | [路径总和 III](https://leetcode.cn/problems/path-sum-iii/) | 中等 | L0 | 0 | — | — |
| 236 | [二叉树的最近公共祖先](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/) | 中等 | L0 | 0 | — | — |
| 124 | [二叉树中的最大路径和](https://leetcode.cn/problems/binary-tree-maximum-path-sum/) | 困难 | L0 | 0 | — | — |

## 09. 图论

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 200 | [岛屿数量](https://leetcode.cn/problems/number-of-islands/) | 中等 | L0 | 0 | — | — |
| 994 | [腐烂的橘子](https://leetcode.cn/problems/rotting-oranges/) | 中等 | L0 | 0 | — | — |
| 207 | [课程表](https://leetcode.cn/problems/course-schedule/) | 中等 | L0 | 0 | — | — |
| 208 | [实现 Trie (前缀树)](https://leetcode.cn/problems/implement-trie-prefix-tree/) | 中等 | L0 | 0 | — | — |

## 10. 回溯

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 46 | [全排列](https://leetcode.cn/problems/permutations/) | 中等 | L0 | 0 | — | — |
| 78 | [子集](https://leetcode.cn/problems/subsets/) | 中等 | L0 | 0 | — | — |
| 17 | [电话号码的字母组合](https://leetcode.cn/problems/letter-combinations-of-a-phone-number/) | 中等 | L0 | 0 | — | — |
| 39 | [组合总和](https://leetcode.cn/problems/combination-sum/) | 中等 | L0 | 0 | — | — |
| 22 | [括号生成](https://leetcode.cn/problems/generate-parentheses/) | 中等 | L0 | 0 | — | — |
| 79 | [单词搜索](https://leetcode.cn/problems/word-search/) | 中等 | L0 | 0 | — | — |
| 131 | [分割回文串](https://leetcode.cn/problems/palindrome-partitioning/) | 中等 | L0 | 0 | — | — |
| 51 | [N 皇后](https://leetcode.cn/problems/n-queens/) | 困难 | L0 | 0 | — | — |

## 11. 二分查找

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 35 | [搜索插入位置](https://leetcode.cn/problems/search-insert-position/) | 简单 | L0 | 0 | — | — |
| 74 | [搜索二维矩阵](https://leetcode.cn/problems/search-a-2d-matrix/) | 中等 | L0 | 0 | — | — |
| 34 | [在排序数组中查找元素的第一个和最后一个位置](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/) | 中等 | L0 | 0 | — | — |
| 33 | [搜索旋转排序数组](https://leetcode.cn/problems/search-in-rotated-sorted-array/) | 中等 | L0 | 0 | — | — |
| 153 | [寻找旋转排序数组中的最小值](https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array/) | 中等 | L0 | 0 | — | — |
| 4 | [寻找两个正序数组的中位数](https://leetcode.cn/problems/median-of-two-sorted-arrays/) | 困难 | L0 | 0 | — | — |

## 12. 栈

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 20 | [有效的括号](https://leetcode.cn/problems/valid-parentheses/) | 简单 | L0 | 0 | — | — |
| 155 | [最小栈](https://leetcode.cn/problems/min-stack/) | 中等 | L0 | 0 | — | — |
| 394 | [字符串解码](https://leetcode.cn/problems/decode-string/) | 中等 | L0 | 0 | — | — |
| 739 | [每日温度](https://leetcode.cn/problems/daily-temperatures/) | 中等 | L0 | 0 | — | — |
| 84 | [柱状图中最大的矩形](https://leetcode.cn/problems/largest-rectangle-in-histogram/) | 困难 | L0 | 0 | — | — |

## 13. 堆

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 215 | [数组中的第K个最大元素](https://leetcode.cn/problems/kth-largest-element-in-an-array/) | 中等 | L0 | 0 | — | — |
| 347 | [前 K 个高频元素](https://leetcode.cn/problems/top-k-frequent-elements/) | 中等 | L0 | 0 | — | — |
| 295 | [数据流的中位数](https://leetcode.cn/problems/find-median-from-data-stream/) | 困难 | L0 | 0 | — | — |

## 14. 贪心算法

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 121 | [买卖股票的最佳时机](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/) | 简单 | L0 | 0 | — | — |
| 55 | [跳跃游戏](https://leetcode.cn/problems/jump-game/) | 中等 | L0 | 0 | — | — |
| 45 | [跳跃游戏 II](https://leetcode.cn/problems/jump-game-ii/) | 中等 | L0 | 0 | — | — |
| 763 | [划分字母区间](https://leetcode.cn/problems/partition-labels/) | 中等 | L0 | 0 | — | — |

## 15. 动态规划

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 70 | [爬楼梯](https://leetcode.cn/problems/climbing-stairs/) | 简单 | L0 | 0 | — | — |
| 118 | [杨辉三角](https://leetcode.cn/problems/pascals-triangle/) | 简单 | L0 | 0 | — | — |
| 198 | [打家劫舍](https://leetcode.cn/problems/house-robber/) | 中等 | L0 | 0 | — | — |
| 279 | [完全平方数](https://leetcode.cn/problems/perfect-squares/) | 中等 | L0 | 0 | — | — |
| 322 | [零钱兑换](https://leetcode.cn/problems/coin-change/) | 中等 | L0 | 0 | — | — |
| 139 | [单词拆分](https://leetcode.cn/problems/word-break/) | 中等 | L0 | 0 | — | — |
| 300 | [最长递增子序列](https://leetcode.cn/problems/longest-increasing-subsequence/) | 中等 | L0 | 0 | — | — |
| 152 | [乘积最大子数组](https://leetcode.cn/problems/maximum-product-subarray/) | 中等 | L0 | 0 | — | — |
| 416 | [分割等和子集](https://leetcode.cn/problems/partition-equal-subset-sum/) | 中等 | L0 | 0 | — | — |
| 32 | [最长有效括号](https://leetcode.cn/problems/longest-valid-parentheses/) | 困难 | L0 | 0 | — | — |

## 16. 多维动态规划

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 62 | [不同路径](https://leetcode.cn/problems/unique-paths/) | 中等 | L0 | 0 | — | — |
| 64 | [最小路径和](https://leetcode.cn/problems/minimum-path-sum/) | 中等 | L0 | 0 | — | — |
| 5 | [最长回文子串](https://leetcode.cn/problems/longest-palindromic-substring/) | 中等 | L0 | 0 | — | — |
| 1143 | [最长公共子序列](https://leetcode.cn/problems/longest-common-subsequence/) | 中等 | L0 | 0 | — | — |
| 72 | [编辑距离](https://leetcode.cn/problems/edit-distance/) | 中等 | L0 | 0 | — | — |

## 17. 技巧

| 题号 | 题目 | 难度 | 掌握程度 | 练习次数 | 最近练习时间 | 下次复习时间 |
| --- | --- | --- | --- | --- | --- | --- |
| 136 | [只出现一次的数字](https://leetcode.cn/problems/single-number/) | 简单 | L0 | 0 | — | — |
| 169 | [多数元素](https://leetcode.cn/problems/majority-element/) | 简单 | L0 | 0 | — | — |
| 75 | [颜色分类](https://leetcode.cn/problems/sort-colors/) | 中等 | L0 | 0 | — | — |
| 31 | [下一个排列](https://leetcode.cn/problems/next-permutation/) | 中等 | L0 | 0 | — | — |
| 287 | [寻找重复数](https://leetcode.cn/problems/find-the-duplicate-number/) | 中等 | L0 | 0 | — | — |

