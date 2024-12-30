package com.Review.Test;

public class test6 {
    public static void main(String[] args) {
        int result = 1;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            result *= i;
            sum += result;
        }

        System.out.println(result);
        System.out.println(sum);
    }
}
