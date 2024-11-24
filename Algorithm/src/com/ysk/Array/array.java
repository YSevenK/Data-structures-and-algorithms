package com.ysk.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 根据用户输入 长度、具体数字   确定数组以及打印
 */
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入数组长度: ");
        int length = sc.nextInt();

        int[] arr = new int[length];
        readArray(sc, arr);

        // 打印
        System.out.println("输入的数组为:" + Arrays.toString(arr));
    }

    // 接受用户输入的具体数组
    public static void readArray(Scanner sc, int[] arr) {
        System.out.println("输入" + arr.length + "个数字");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("输入第" + (i + 1) + "个数字");
            arr[i] = sc.nextInt();
        }
    }

}
