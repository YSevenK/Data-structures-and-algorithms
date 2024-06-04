package com.ysk.LinearSerch;

public class main {
    public static void main(String[] args) {
        int[] array = {9, 19, 5, 2, 8, 3, 0, 1, 10, 15, 16, 17};
        int index = linerSearch(array, 10);

        if (index != -1) {
            System.out.println("找到元素，索引为：" + index);
        } else {
            System.out.println("未找到元素");
        }
    }

    private static int linerSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
