package com.labuladong.array;

public class append {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 4; i++) {
            arr[i] = i;
        }

        for (int i = 4; i > 2; i--) {
            arr[i] = arr[i - 1];
        }
        arr[2] = 666;
        System.out.println(arr);
    }
}
