package com.Review.ProgramAnalysis;

public class T2 {
    public static void main(String[] args) {
        int A = 54321, sum = 0, t = 10;
        while (t > 0) {
            sum += A % 10 + t;
            A /= 10;
            t /= 10;
        }
        System.out.println(sum);
    }
}
