package com.Review.ProgramAnalysis;

public class T4 {
    public static void main(String[] args) {
        Doll doll = new Doll("Kitty", 2);
        System.out.println(doll);
    }
}

class Doll {
    String name;
    int age;

    public Doll(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name;
    }
}
