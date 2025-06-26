package com.tanky.hot100;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author zhangzhongguo <zhangzhongguo@kuaishou.com>
 * Created on 2025-04-20
 */
public class NiBoLan {

    public static void main(String[] args) {

        String[] tokens = {"4", "13", "5", "/", "+"};
        evalRPN(tokens);
    }


    public static int evalRPN(String[] tokens) {

        Deque<Integer> stack = new LinkedList<>();

        for (String s : tokens) {

            if ("+".equals(s)) {
                Integer v1 = stack.pop();
                Integer v2 = stack.pop();
                Integer sum = v1 + v2;
                stack.push(sum);
            } else if ("-".equals(s)) {
                Integer v1 = stack.pop();
                Integer v2 = stack.pop();
                Integer di = v1 - v2;
                stack.push(di);
            } else if ("*".equals(s)) {
                Integer v1 = stack.pop();
                Integer v2 = stack.pop();
                Integer mu = v1 * v2;
                stack.push(mu);
            } else if ("/".equals(s)) {
                Integer v1 = stack.pop();
                Integer v2 = stack.pop();
                Integer chu = v1 / v2;
                stack.push(chu);
            } else {
                stack.push(Integer.parseInt(s));
            }

        }
        return stack.pop();

    }
}
