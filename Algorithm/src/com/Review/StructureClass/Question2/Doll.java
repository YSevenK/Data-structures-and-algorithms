package com.Review.StructureClass.Question2;

public class Doll extends Toy implements Colorable {
    private String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void play() {
        System.out.println(color + "Doll");
    }
}
