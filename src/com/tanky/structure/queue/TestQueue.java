package com.tanky.structure.queue;

/**
 * @author tanky
 * @date 2022/03/22
 */
public class TestQueue {

    public static void main(String[] args) {
        QueueOfArray queue = new QueueOfArray(10);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.poll());
    }

}
