package com.edu;

import java.util.Scanner;

public class HW1_2 {
    public static void main(String[] args) {
        String name, address;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        name = sc.nextLine();
        System.out.printf("Where are you live, %s? ", name);
        address = sc.nextLine();
        System.out.printf("\n%s's address is %s", name, address);
    }
}
