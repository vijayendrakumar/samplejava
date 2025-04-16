package com.mvk.collections;

import java.util.HashSet;
import java.util.Set;

public class HashMapSetExample {
    public static void hashMapSetEx() {
        Set<String> emails = new HashSet<>();
        emails.add("vij@gmail.com");
        emails.add("shyly@gmail.com");
        emails.add("dhu@gmail.com");

        for (String email: emails) {
            System.out.println(email);
        }
    }
}
