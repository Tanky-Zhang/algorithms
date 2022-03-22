package com.tanky.structure.stack;

import com.tanky.structure.queue.QueueOfArray;

/**
 * 用双队列实现栈
 * 思考：栈应该有什么方法，压栈、弹栈、判空、判满
 *
 * @author tanky
 * @date 2022/03/22
 */
public class StackOfDoubleQueue {

    /**
     * push的数据会先进这个队列
     */
    QueueOfArray firstQueue = new QueueOfArray(10);

    /**
     * 这个队列作为从first中导入的队列
     */
    QueueOfArray secondQueue = new QueueOfArray(10);

    /**
     * 压栈操作
     *
     * @param data
     */
    public void push(int data) {
        //先放入第一个队列
        firstQueue.addQueue(data);
        //进行数据迁移
        while (!secondQueue.isEmpty()) {
            firstQueue.addQueue(secondQueue.getQueue());
        }
        while (!firstQueue.isEmpty()) {
            secondQueue.addQueue(firstQueue.getQueue());
        }

    }


    /**
     * 弹栈方法
     *
     * @return
     */
    public int pop() {
        return secondQueue.getQueue();
    }
}
