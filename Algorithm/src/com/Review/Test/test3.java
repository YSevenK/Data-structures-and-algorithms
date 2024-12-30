package com.Review.Test;

public class test3 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("xi");
        Dog dog2 = new Dog("xi");
        String s1 = dog1.toString();
        String s2 = dog2.toString();
        String s3 = "xiao";
        String s4 = "xiao";

        System.out.println(dog1.equals(dog2));
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
    }
}

class Dog {
    public String name;

    Dog(String name) {
        this.name = name;
    }
}
