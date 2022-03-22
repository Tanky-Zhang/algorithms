package com.tanky.structure.stack;

import com.tanky.structure.queue.QueueOfArray;

/**
 * @author tanky
 * @date 2022/03/22
 */
public class StackOfQueue {


    private static final QueueOfArray queue = new QueueOfArray(10);

    /**
     * push方法
     *
     * @param data
     */
    public void push(int data) {
        queue.push(data);
        while (queue.peek() != data) {
            queue.push(queue.poll());
        }
    }


    /**
     * 弹栈方法
     *
     * @return
     */
    public int pop() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean isFull() {
        return queue.isFull();
    }
}
