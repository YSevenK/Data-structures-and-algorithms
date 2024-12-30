package com.Review.Construction;

class Student3 {
    private String name;
    private int age;

    public Student3(String n) {
        this.name = n;
        System.out.println("==>有参构造-一个参数");
    }

    public Student3(String n, int a) {
        this.name = n;
        this.age = a;
        System.out.println("==>有参构造-两个参数");
    }

    public void read() {
        System.out.println("我是:" + name + ",年龄:" + age);
    }
}

public class exam3 {
    public static void main(String[] args) {
        Student3 stu1 = new Student3("张三");
        Student3 stu2 = new Student3("李四", 18);
        stu1.read();
        stu2.read();
    }

}
