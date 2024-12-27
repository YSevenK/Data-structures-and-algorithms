package com.Review.ExceptionDemo;

public class exam01 {
    public static void main(String[] args) {
        try {
            int result = divide(4, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("捕获的信息: " + e.getMessage());
            return;
        } finally {
            System.out.println("finally 继续执行");
        }
    }

    public static int divide(int x, int y) {
        int result = x / y;
        return result;
    }
}
