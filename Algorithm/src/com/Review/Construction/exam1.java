package com.Review.Construction;

/**
 * 无参构造方法
 */
class Student {
    public Student() {
        System.out.println("==>无参构造");
    }
}

public class exam1 {
    public static void main(String[] args) {
        System.out.println("==>声明对象");
        Student stu = null;
        System.out.println("==>实例化对象");
        stu = new Student();
    }
}
