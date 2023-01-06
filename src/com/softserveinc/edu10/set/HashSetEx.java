package com.softserveinc.edu10.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Olha");
        set.add("Anastasia");
        set.add("Dmytro");
        set.add("Natalia");
        set.add("Oleksandr");
        set.add("Maksim");
        set.add("Vitaliy");
        set.add("Vitaliy");
        set.add(null);

        // System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
       // set.remove("Olha");
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Olha"));
    }
}
