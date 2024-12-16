package com.Review;


import java.util.Scanner;

public class algo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入整数n
        System.out.print("请输入一个整数n：");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        // 使用while循环计算从1到n的和
        while (i <= n) {
            sum += i;
            i++;
        }

        // 输出结果
        System.out.println("从1到 " + n + " 的和是：" + sum);

        scanner.close();
    }
}
