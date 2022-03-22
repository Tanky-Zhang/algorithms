package com.tanky.structure.queue;

import com.tanky.structure.stack.StackOfArray;

/**
 * @author tanky
 * @date 2022/03/22
 */
public class QueueOfStack {


    private StackOfArray firstStack = new StackOfArray(10);

    /**
     * 永远为空的临时数组
     */
    private StackOfArray secondStack = new StackOfArray(10);


    /**
     * push方法
     *
     * @param data
     */
    public void push(int data) {
        if (firstStack.isFull()) {
            throw new RuntimeException("栈已满");
        }
        while (!secondStack.isEmpty()) {
            firstStack.push(secondStack.pop());
        }
        secondStack.push(data);
        while (!firstStack.isEmpty()) {
            firstStack.push(secondStack.pop());
        }
    }


    public int poll() {
        if (firstStack.isEmpty()) {
            throw new RuntimeException("栈已空");
        }
        return firstStack.pop();
    }

    public boolean isEmpty() {
        return firstStack.isEmpty();
    }

    public boolean isFull() {
        return firstStack.isFull();

    }
}
