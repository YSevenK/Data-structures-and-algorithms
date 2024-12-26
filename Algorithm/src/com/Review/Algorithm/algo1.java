package com.Review.Algorithm;

/**
 * 期末复习题算法1
 */
public class algo1 {
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 7, 4, 6, 3, 1, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == 0 ? arr[i] : "," + arr[i]);
        }
        bubble(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == 0 ? arr[i] : "," + arr[i]);
        }
    }
}
