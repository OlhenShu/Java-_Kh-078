package com.edu;

import java.util.Scanner;

public class HW1_3 {
    public static void main(String[] args) {
        float c1, c2, c3;
        float t1, t2, t3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a call fee for the 1st country (standard units per minute): ");
        c1 = sc.nextFloat();
        System.out.print("Enter a call duration to the 1st country (minutes): ");
        t1 = sc.nextFloat();
        System.out.print("Enter a call fee for the 2nd country (standard units per minute): ");
        c2 = sc.nextFloat();
        System.out.print("Enter a call duration to the 2nd country (minutes): ");
        t2 = sc.nextFloat();
        System.out.print("Enter a call fee for the 3rd country (standard units per minute): ");
        c3 = sc.nextFloat();
        System.out.print("Enter a call duration to the 3rd country (minutes): ");
        t3 = sc.nextFloat();

        System.out.printf("\nThe fee of a call to the 1st country (standard units): %.2f", c1 * t1);
        System.out.printf("\nThe fee of a call to the 2nd country (standard units): %.2f", c2 * t2);
        System.out.printf("\nThe fee of a call to the 3rd country (standard units): %.2f", c3 * t3);
        System.out.printf("\nThe total fee of all calls (standard units): %.2f", c1 * t1 + c2 * t2 + c3 * t3);
    }
}
