package com.ysk.HashTable;

import java.util.Hashtable;

public class main {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>(10);
        table.put("100", "bob1");
        table.put("123", "bob2");
        table.put("321", "bob3");
        table.put("555", "bob4");
        table.put("777", "bob5");

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + "key: " + key + ", value: " + table.get(key));
        }
    }
}
