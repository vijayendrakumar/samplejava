package com.mvk.collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
    public static void hashMap() {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Vijayendra");
        students.put(2, "Shailendra");
        students.put(3, "Dhuhitha");
        System.out.println(STR."Studenta: \{students}");

        for (Map.Entry<Integer, String> entry: students.entrySet()) {
            System.out.println(STR."\{entry.getKey()} =>\{entry.getValue()}");
        }
    }

}
