package com.Review.Algorithm;

public class algo2 {
    /**
     * 法二:charAt方法
     *
     * @param str
     * @return
     */
    static boolean isPalindrome(String str) {
        StringBuffer reversedStr = new StringBuffer(str).reverse();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != reversedStr.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /**
         * 法一 转成字符串后equals
         */
        // StringBuffer a = new StringBuffer("12211");
        // StringBuffer b = new StringBuffer(a.reverse());
        // boolean result = a.toString().equals(b.toString());
        // System.out.println(result);

        System.out.println(isPalindrome("24742") ? "是回文数" : "不是回文数");
    }
}
