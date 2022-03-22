package com.tanky.structure.stack;

/**
 * 栈的测试主方法
 *
 * @author tanky
 * @date 2022/03/22
 */
public class TestStack {

    public static void main(String[] args) {
        StackOfDoubleQueue stack=new StackOfDoubleQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
