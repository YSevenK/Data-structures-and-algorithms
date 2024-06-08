package com.ysk.SelectionSort;

public class main {
    public static void main(String[] args) {
        int array[] = {5, 2, 9, 1, 4, 6};

        selectionSort(array);

        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
