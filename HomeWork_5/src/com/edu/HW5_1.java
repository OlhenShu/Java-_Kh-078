package com.edu;

import java.util.Scanner;

public class HW5_1 {
    public static void main(String[] args) {
        byte[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of month: ");
        byte month = sc.nextByte();
        if (month >= 1 && month <= 12) {
            System.out.printf("The number of days in the %d month is %d\n", month, daysInMonth[month - 1]);
        } else {
            System.out.println("You have entered the wrong number of month!");
        }
    }
}
