package com.Review.Test;

public class test7 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i + 2; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
