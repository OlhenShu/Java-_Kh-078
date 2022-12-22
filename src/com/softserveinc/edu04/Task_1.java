package com.softserveinc.edu04;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st integer number: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a % 2 != 0) { count++; }
        System.out.print("Enter the 2nd integer number: ");
        if (b % 2 != 0) { count++; }
        System.out.print("Enter the 3rd integer number: ");
        if (c % 2 != 0) { count++; }

        System.out.println("You have entered %d odd numbers" + count);
        sc.close();

    }
}