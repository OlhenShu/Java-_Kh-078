package com.edu;

import java.util.Scanner;

public class HW5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of month: ");
        int month = sc.nextInt();
        if (month >= 1 && month <= 12) {
            System.out.printf("The number of days in the %d month is %d\n", month, daysInMonth(month));
        } else {
            System.out.println("You have entered the wrong number of month!");
        }
    }

    public static int daysInMonth (int month) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month - 1];
    }
}
