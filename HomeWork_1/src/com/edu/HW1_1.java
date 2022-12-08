package com.edu;

import java.util.Scanner;
import static java.lang.Math.*;

public class HW1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a radius (cm): ");
        float radius = sc.nextFloat();
        System.out.printf("\nThe perimeter of the circle is %.2f (cm)", 2 * PI * radius);
        System.out.printf("\nThe area of the circle is %.2f (sq cm)", PI * pow(radius, 2));
    }
}
