# Java 算法面试训练

面向有研发经验、需要重新建立算法熟练度的 Java 面试训练。严格使用[力扣官方新版 Hot 100](https://leetcode.cn/studyplan/top-100-liked/)，按官方 17 个专题与 100 题顺序推进。

## 开始

环境：JDK 17、Maven 3.9+、JUnit 5。运行：
项目通过 .mvn/maven.config 使用项目内缓存 .mvn/repository 和 Maven Central，避免依赖本机全局的私有镜像或只读仓库；不修改全局 Maven 设置。首次运行需联网下载依赖。

```sh
mvn test
mvn -Dtest=TwoSumTest test
```

已完成 TwoSum、GroupAnagrams、LongestConsecutive、MoveZeroes、ContainerWithMostWater、ThreeSum、TrappingRainWater 的首练与测试。接雨水另有教练提供的 trapTwoPointers 示范。后续新题仅在开始时创建模板，未实现模板应真实报告失败，不跳过或伪装通过。全量验证运行 `mvn test`。

## 目录

- `src/main/java/com/tanky/hot100/<专题>`：训练实现，仅在开始某题时创建模板。
- `src/test/java/com/tanky/hot100/<专题>`：JUnit 5 测试。
- [progress.md](progress.md)：官方顺序、题目链接、难度、练习与复习进度。
- [curriculum/hot100.json](curriculum/hot100.json)：2026-11-24 官方页面结构化题单快照。
- [notes/](notes/README.md)：按专题组织的知识与错题总结。
- [AGENTS.md](AGENTS.md)：长期辅导约定。

Maven 仅使用标准目录 src/main/java 与 src/test/java。现有 src/com、leetcode 为历史练习，保留但不纳入本轮训练或 Maven 构建；原 README 保存在 docs/archive/legacy-algorithm-taxonomy.md。本轮范围以 progress.md 为准，仓库主入口为 README.md。

## 训练流程

按顺序开始题目 → 教练提供题意、模板、测试 → 你描述思路并实现 → 教练运行测试并审查正确性、边界、复杂度与代码质量 → 总结面试表达 → 更新进度并安排 D+1/3/7/14 复习。遇到困难时一次给一层提示，等待你思考。

月度目标与每日新题见 [PLAN.md](PLAN.md)；每次结束时在 [notes/sessions.md](notes/sessions.md) 留下交接，下一次先读交接与到期复习。

当前：2026-11-26 训练结束，累计覆盖10/100。今日3、560提示后完成、438教练纠正后完成；六道D+1口述已记录，口述未增加编码次数。

560已实现，可用mvn test全量验证。下次先复习1、3、438、560（11月27日到期），新题从239. 滑动窗口最大值开始，届时创建模板和测试。
