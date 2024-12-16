package com.Review.StructureClass.Question2;

public class Car extends Toy implements Colorable {
    private String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void play() {
        System.out.println(color + "Car");
    }
}
