package com.ysk.binarySearch;

public class BinarySearch_02 {
    /**
     * 二分查找第二版
     * params:a-待查找的升序数组
     * target-待查找的目标值
     * Returns:
     * 找到返回索引
     * 找不到返回 -1
     */
    public static int BinarySearchBasic(int[] a, int target) {
        int i = 0, j = a.length; // 改动1
        while (i < j) {    // 改动2
            int m = (i + j) / 2;
            if (target < a[m]) {
                j = m;  // 改动3
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}