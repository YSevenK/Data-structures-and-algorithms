package com.Review;

public class algo3 {
    static int factorialAndSum(int start, int end) {
        int sum = 0;
        for (int i = start; i < end + 1; i++) {
            int factorial = 1;
            for (int j = 2; j <= i; j++) {
                factorial *= j;
            }
            sum += factorial;
        }
        return sum;
    }

    public static void main(String[] args) {
        int start = 3;
        int end = 11;
        int result = factorialAndSum(start, end);
        System.out.println(result);
    }
}
