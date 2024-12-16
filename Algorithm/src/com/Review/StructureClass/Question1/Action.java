package com.Review.StructureClass.Question1;

public interface Action {
    String reaction = "run";

    void act();

    static void info() {
        System.out.println("接口：静态方法");
    }

    default void shout() {
        System.out.println("接口：" + reaction);
    }
}
