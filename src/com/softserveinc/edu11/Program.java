package com.softserveinc.edu11;

public class Program {
    public static void main(String[] args) {
        String a = "a";
        String A = "A";
        String b = "a";
        System.out.println(a.equals(A));
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(A));
        System.out.println(a.compareTo(A));
        System.out.println(a.compareToIgnoreCase(A));
    }
}
