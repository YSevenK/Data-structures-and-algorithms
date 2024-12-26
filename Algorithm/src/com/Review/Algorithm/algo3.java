package com.Review.Algorithm;

public class algo3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i < 12; i++) {
            sum += factorial(i);
        }
        System.out.println(sum);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
