package com.Review.Test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入: ");
        int n = sc.nextInt();
        // 将整数转换为字符串
        String numStr = String.valueOf(n);
        StringBuffer s1 = new StringBuffer(numStr);
        String s2 = s1.reverse().toString();

        if (numStr.equals(s2)) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是");
        }
        sc.close();
    }
}
