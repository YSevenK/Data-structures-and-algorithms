package com.Review.fix;

public class T4 {
    public static void main(String[] args) {
        try {
            int result = divide(4, 0);
            System.out.println(result);
        } catch (Exception e) {
            // System.err.println();
            System.out.println("异常");
        }
    }

    public static int divide(int x, int y) throws Exception {
        int result = x / y;
        return result;
    }
}
