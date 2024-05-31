package com.ysk.stack;

import java.util.Stack;


public class main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // System.out.println(stack.empty());
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        // 将栈顶元素从栈中删除
        // stack.pop();
        // stack.pop();
        // stack.pop();
        String num = stack.pop();

        // System.out.println(stack);
        // System.out.println(num);
        // System.out.println(stack.peek());
        System.out.println(stack.search("2"));

    }
}
