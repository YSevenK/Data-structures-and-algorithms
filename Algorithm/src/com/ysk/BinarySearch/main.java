package com.ysk.BinarySearch;

public class main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int target = 42;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        // int index = Arrays.binarySearch(arr, target);
        int index = binarySearch(arr, target);

        if (index == -1) {
            System.out.println(target + "not found");
        } else {
            System.out.println("Element found at: " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {

            int middle = low + (high - low) / 2;
            int value = array[middle];
            System.out.println("middle value " + value);
            if (value < target) low = middle + 1;
            else if (value > target) high = middle - 1;
            else return middle;
        }

        return -1;
    }
}
