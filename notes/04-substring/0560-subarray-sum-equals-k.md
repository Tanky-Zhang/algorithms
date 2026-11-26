# 560. 和为 K 的子数组 · 中等

来源：[力扣官方题目](https://leetcode.cn/problems/subarray-sum-equals-k/description/)，2026-11-26 核对。

统计整数数组中元素和等于 k 的连续非空子数组个数。不同起止下标算不同子数组，允许重叠；返回个数，不是长度或下标列表。

约束：1 ≤ nums.length ≤ 20000；-1000 ≤ nums[i] ≤ 1000；-10^7 ≤ k ≤ 10^7。

[1,1,1],k=2 → 2（[0,1] 和 [1,2] 两个区间）。
[1,2,3],k=3 → 2（[1,2] 和 [3] 两个子数组）。
[0,0,0],k=0 → 6。

模板：src/main/java/com/tanky/hot100/substring/SubarraySumEqualsK.java。
测试：src/test/java/com/tanky/hot100/substring/SubarraySumEqualsKTest.java。
运行：mvn -Dtest=SubarraySumEqualsKTest test。

12 组测试覆盖官方示例、单元素、无解、零与重复区间和、负目标、正负混合和最大规模计数。

## 本人思路与提示

待本人描述，不提前提供核心实现。

## 错误与复杂度

待实现后审查；模板不计完成。

## 通用思想与面试表达

待练习后总结。
