package com.ysk.binarySearch;

public class BinarySearch_01 {
    /**
     * 二分查找基础版
     * params:a-待查找的升序数组
     * target-待查找的目标值
     * Returns:
     * 找到返回索引
     * 找不到返回 -1
     */
    public static int BinarySearchBasic(int[] a, int target) {
        int i = 0, j = a.length - 1; // 设置指针和初值
        while (i <= j) {    // i~j 范围内有东西
            int m = (i + j) / 2;    // 会自动取整
            // int m = (i + j) >>> 1;    // 二进制形式右移一位 和 除2 一样
            if (target < a[m]) {
                j = m - 1;  // 目标在左侧
            } else if (a[m] < target) {
                i = m + 1;  // 目标在右侧
            } else {
                return m;   // 目标等于中间值 直接return
            }
        }
        return -1;
    }
}
