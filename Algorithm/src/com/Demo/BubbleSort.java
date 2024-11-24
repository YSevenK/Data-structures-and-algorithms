package com.Demo;

public class BubbleSort {
    static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.print("排序前:");
        int[] arr = {1, 6, 8, 3, 2, 7, 9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == 0 ? arr[i] : "," + arr[i]);
        }
        System.out.println();
        int[] sortedArray = bubbleSort(arr);
        System.out.print("冒泡排序后(从小到大):");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(i == 0 ? sortedArray[i] : "," + sortedArray[i]);
        }
    }
}
