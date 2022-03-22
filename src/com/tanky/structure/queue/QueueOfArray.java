package com.tanky.structure.queue;

/**
 * 使用数组实现队列,这个版本有问题，不能保证队列中永远有10个元素，因为当加满弹出以后队列再也不能添加
 *
 * @author tanky
 * @date 2022/03/22
 */
public class QueueOfArray {

    /**
     * 队列的最大长度
     */
    private int maxSize;

    /**
     * 前部的索引
     */
    private int front;
    /**
     * 后部的索引
     */
    private int rear;

    /**
     * 底层数组
     */
    private int[] arr;

    public QueueOfArray(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * 添加元素
     *
     * @param n
     */
    public void push(int n) {
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    /**
     * 从队列获取第一个元素
     *
     * @return
     */
    public int poll() {
        if (isEmpty()) {
            throw new RuntimeException("队列是空的");
        }
        return arr[++front];
    }


    /**
     * 查看头元素 但不会让其出栈
     *
     * @return
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("队列是空的");
        }
        int data = arr[++front];
        front--;
        return data;
    }

    /**
     * 打印队列中的所有元素
     */
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列是空的");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }

}
