package com.Review.ProgramAnalysis;

public class T3 {
    public static void main(String[] args) {
        String str = new String("Hello");
        changeStr(str);
        System.out.println(str);
    }

    public static void changeStr(String s) {
        s = s + " world";
    }
}
