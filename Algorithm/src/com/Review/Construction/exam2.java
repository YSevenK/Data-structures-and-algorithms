package com.Review.Construction;

/**
 * 有参构造方法
 */
class Student2 {
    private String name;
    private int age;

    public Student2(String n, int a) {
        this.name = n;
        this.age = a;
        System.out.println("==>有参构造");
    }

    public void read() {
        System.out.println("我是:" + name + ",年龄:" + age);
    }
}

public class exam2 {
    public static void main(String[] args) {
        Student2 stu = new Student2("张三", 8);
        stu.read();
    }
}
