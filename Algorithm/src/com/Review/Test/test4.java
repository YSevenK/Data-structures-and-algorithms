package com.Review.Test;

public class test4 {
    public static void main(String[] args) {
        int[] a = {1, 6, 2, 8, 4};
        for (int i = 0; i < a.length; i++) {
            System.out.print(i != 0 ? "," + a[i] : a[i]);
        }
        bubbleSort(a);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(i != 0 ? "," + a[i] : a[i]);
        }

    }

    static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
