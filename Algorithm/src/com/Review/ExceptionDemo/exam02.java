package com.Review.ExceptionDemo;

public class exam02 {
    public static void main(String[] args) {
        try {
            int result = divide(4, 0);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int divide(int x, int y) {
        int result = x / y;
        return result;
    }
}
