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

        if (isFull()) {
            throw new RuntimeException("栈已满");
        }

        //先放入第一个队列
        firstQueue.push(data);
        //进行数据迁移
        while (!secondQueue.isEmpty()) {
            firstQueue.push(secondQueue.poll());
        }

        //引用交换
        QueueOfArray tmp = firstQueue;
        firstQueue = secondQueue;
        secondQueue = tmp;
    }

    /**
     * 弹栈方法
     *
     * @return
     */
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        return secondQueue.poll();
    }


    /**
     * 判空
     *
     * @return
     */
    public boolean isEmpty() {
        return secondQueue.isEmpty();
    }

    /**
     * 判满
     *
     * @return
     */
    public boolean isFull() {
        return secondQueue.isFull();
    }
}
