package com.ysk.DynamicArray;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);

        // System.out.println(dynamicArray.capacity);

        /*dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");*/
        // System.out.println(dynamicArray);


        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");

        // dynamicArray.insert(0, "F**K");
        // dynamicArray.delete("A");

        System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("size:" + dynamicArray.size);
        System.out.println("capacity:" + dynamicArray.capacity);
        System.out.println("empty:" + dynamicArray.isEmpty());

    }
}
