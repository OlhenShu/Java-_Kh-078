package com.softserveinc.edu10.set;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(16);
        treeSet.add(12);
        treeSet.add(4);
        //treeSet.(null);
        System.out.println(treeSet);
    }
}
