# Java 算法面试练习仓库

使用 Java 17、Maven 和 JUnit 5，严格按[力扣官方新版 Hot 100](https://leetcode.cn/studyplan/top-100-liked/)的专题与题目顺序训练。目标：2026-12-24 前完成首轮覆盖与集中巩固。

## 训练入口

- [训练指南](TRAINING.md)：编码、测试和教练配合方式。
- [30 天计划](PLAN.md)：每日题目安排及时间预算。
- [训练进度](progress.md)：100 道题的掌握程度、练习次数和复习日期。
- [训练交接记录](notes/sessions.md)：已完成内容和下次开始位置。
- [知识与错题笔记](notes/README.md)、[复习记录](notes/reviews.md)。
- [辅导规则](AGENTS.md)、[官方题单快照](curriculum/hot100.json)。

## 当前状态（2026-11-25 收尾）

首练通过 7/100：1、49、128、283、11、15、42。测试通过与独立掌握分别记录。
今天完成 6 道新题（49、128、283、11、15、42），另完成两数之和口述复习。额外加练完成 2/5，其余 3、438、560 下次接续，不计为已完成。
11 月 26 日先复习今日六题，重点为三数之和去重、接雨水逐格水量与双指针边界；新题从 3. 无重复字符的最长子串开始。
三数之和后续优化及接雨水双指针版本由教练在明确授权后提供，不计独立编码或额外练习次数。

## 写代码与验证

在 IDE 中以 Maven 项目导入根目录的 pom.xml，项目 JDK 选择 17。

```sh
mvn test
mvn -Dtest=GroupAnagramsTest test
mvn -Dtest=LongestConsecutiveTest test
```

直接编辑 src/main/java/com/tanky/hot100 下对应 Java 文件；不需要 main 或控制台输入。测试在 src/test/java/com/tanky/hot100。核心算法由本人编写，教练负责渐进提示和审查。

## 仓库结构

```text
src/main/java/com/tanky/hot100/  按官方专题分包的练习
src/test/java/com/tanky/hot100/  对应 JUnit 5 测试
curriculum/                    官方题单快照
notes/01-hash/ ... 17-tricks/    专题知识与错题总结
notes/reviews.md                间隔复习
notes/sessions.md               每次训练与交接
docs/archive/                  历史参考资料
```

历史练习仍在 src/com 和 leetcode，Maven 仅编译标准目录；历史内容不计入本轮题单。原 README 全文保存在 [历史分类笔记](docs/archive/legacy-algorithm-taxonomy.md)，仅供存档，本轮分类以官方题单为准。

构建产物 target/ 与项目 Maven 缓存 .mvn/repository/ 已忽略；项目使用 Maven Central，不修改全局 Maven 设置。
