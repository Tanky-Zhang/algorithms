# 239. 滑动窗口最大值 · 困难

来源：[力扣官方题目](https://leetcode.cn/problems/sliding-window-maximum/)。

给定整数数组 nums 和窗口大小 k，窗口从数组左端开始每次右移一格，按顺序返回每个完整窗口中的最大值。不能排序输入改变窗口成员。

约束：1 ≤ nums.length ≤ 100000；-10000 ≤ nums[i] ≤ 10000；1 ≤ k ≤ nums.length。

[1,3,-1,-3,5,3,6,7],k=3 → [3,3,5,5,6,7]。
[1],k=1 → [1]。

模板：src/main/java/com/tanky/hot100/substring/SlidingWindowMaximum.java。
测试：src/test/java/com/tanky/hot100/substring/SlidingWindowMaximumTest.java。
运行：mvn -Dtest=SlidingWindowMaximumTest test。

13组测试覆盖官方示例、单元素、k=1、k=n、单调、相同值、负数、旧最大值过期、重复最大值和最大规模。性能仍需结合总操作次数分析。

## 本人思路与提示

已讨论暴力O(nk)、新值淘汰旧较小候选、保存下标判断过期、队头/队尾职责。本人经提示答对[9,4,3]加入7得到[9,7]、过期下标<=i-k、首次输出i=k-1。已提供Deque API说明，完整交接见根目录HANDOFF.md。

## 错误与复杂度

交接前当前草稿编译失败，JUnit未执行。草稿存在语法、导入、返回及值/下标混用问题，候选维护尚未完成；学员准备另一Codex继续。保留本人草稿，不代写修正，不增加练习次数或完成数。

## 通用思想与面试表达

待练习后总结。
