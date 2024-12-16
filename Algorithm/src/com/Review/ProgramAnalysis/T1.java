package com.Review.ProgramAnalysis;

import java.util.ArrayList;

public class T1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.remove(1);
        list.add("赵六");
        System.out.println(list);
    }
}
