package com.Review.Algorithm;

public class algo22 {
    public static boolean isPalindrome(String str) {
        // 使用StringBuffer来处理字符串，因为它是可变的，适合做修改操作
        StringBuffer buffer = new StringBuffer(str);
        // 反转字符串
        StringBuffer reversedBuffer = buffer.reverse();
        // 将反转后的StringBuffer转换回字符串与原字符串进行比较
        String reversedStr = reversedBuffer.toString();
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        String testStr = "abcba";
        boolean result = isPalindrome(testStr);
        System.out.println(testStr + " 是否为回文：" + result);
    }
}
