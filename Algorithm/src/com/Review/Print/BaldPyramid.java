package com.Review.Print;

public class BaldPyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {// 打空格
                System.out.print(" ");
            }

            for (int k = 0; k < i + 2; k++) {// 打*号
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
