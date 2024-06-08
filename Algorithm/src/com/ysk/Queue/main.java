package com.ysk.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");

        // System.out.println(queue.peek());
        queue.poll(); // 取出并删除一个元素
        // queue.poll(); // 取出并删除一个元素
        System.out.println(queue);
        System.out.println(queue.contains("b"));
    }
}
