package com.Review.StructureClass.Question1;

public class testAction {
    public static void main(String[] args) {
        // 通过匿名内部类实现Action接口
        Action action = new Action() {
            @Override
            public void act() {
                System.out.println("匿名内部类实现 act()");
            }
        };

        // 调用抽象方法act，此时执行的是匿名内部类中重写的act方法
        action.act();

        // 调用静态方法info，通过接口名直接调用
        Action.info();

        // 调用默认方法shout，此时执行的是匿名内部类从接口继承来的默认方法shout
        action.shout();
    }
}