package com.Review.StructureClass.Question1;

public class testAction implements Action {
    @Override
    public void act() {
        System.out.println("实现类：act方法");
    }
}

class Main {
    public static void main(String[] args) {
        Action.info();

        testAction action = new testAction();
        action.act();
        action.shout();
    }
}