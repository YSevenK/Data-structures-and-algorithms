package com.Review.ListDemo;

import java.util.ArrayList;

public class exam1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        System.out.println("长度: " + arrayList.size());
        System.out.println("第2个元素是 " + arrayList.get(2));
        arrayList.remove(2);
        System.out.println("删除索引为2的元素 " + arrayList);
        arrayList.set(1, "李四2");
        System.out.println("替换索引为1的元素: " + arrayList);
    }
}
