package com.tanky.structure.stack;

/**
 * 用数组实现栈
 * @author tanky
 * @date 2022/03/22
 */
public class StackOfArray {

    /**
     * 栈所存储的最大长度
     */
    private int maxSize;
    /**
     * 用数组存储数据
     */
    private int[] stack;

    /**
     * 栈顶元素的索引
     */
    private int top = -1;


    public StackOfArray(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    /**
     * 判断栈是否满了
     *
     * @return
     */
    public boolean isFull() {
        return top == maxSize - 1;
    }

    /**
     * 判断栈是否空的
     *
     * @return
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 压栈
     *
     * @param value
     */
    public void push(int value) {
        if (isFull()) {
            System.out.println("栈已满");
            return;
        }
        top++;
        stack[top] = value;
    }

    /**
     * 弹栈
     *
     * @return
     */
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈中没有数据");
        }
        int value = stack[top];
        top--;
        return value;
    }

    /**
     * 打印栈中的所有数据
     */
    public void list() {
        if (isEmpty()) {
            System.out.println("栈中没有数据");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d]=%d\n", i, stack[i]);
        }
    }
}
