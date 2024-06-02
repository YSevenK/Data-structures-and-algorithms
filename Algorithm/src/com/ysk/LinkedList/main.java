package com.ysk.LinkedList;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        LinkedList<String> linkList = new LinkedList<String>();

        /*linkList.push("A");
        linkList.push("B");
        linkList.push("C");*/

        linkList.offer("A");
        linkList.offer("B");
        linkList.offer("C");

        // linkList.add(3, "D");
        // linkList.remove("D");

        System.out.println(linkList);
        System.out.println(linkList.peekFirst());
        System.out.println(linkList.peekLast());
    }
}
