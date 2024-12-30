package com.Review.Test;

class Test {
    private static String name;

    static {
        name = "world";
        System.out.print(name);
    }
}

public class test1 {
    public static void main(String[] args) {
        System.out.print("hello");
        Test test = new Test();
    }
}
