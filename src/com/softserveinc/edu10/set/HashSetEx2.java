package com.softserveinc.edu10.set;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(8);
        hashSet.add(16);
        hashSet.add(12);
        hashSet.add(4);

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(8);
        hashSet1.add(6);
        hashSet1.add(14);
        hashSet1.add(9);

        HashSet<Integer> union = new HashSet<>(hashSet);
        union.addAll(hashSet1);
        System.out.println(union);

        HashSet<Integer> intersection = new HashSet<>(hashSet);
        intersection.retainAll(hashSet1);
        System.out.println(intersection);

        HashSet<Integer> subtract = new HashSet<>(hashSet);
        subtract.removeAll(hashSet1);
        System.out.println(subtract);
    }
}
