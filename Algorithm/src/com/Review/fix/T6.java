package com.Review.fix;

public class T6 {
    public static String SCHOOL_NAME = "成都文理学院";

    public static void main(String args[]) {
        changeSchool("电子科技大学");
        System.out.println(SCHOOL_NAME);
    }

    static void changeSchool(String school) {
        SCHOOL_NAME = school;
    }

}