package com.edu;

import java.util.Scanner;

public class HW5_2 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[10];
        int sum = 0;
        int multiplication = 1;
        boolean checkPositiveNumber = true;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.printf("Enter the %d number: ", i + 1);
            arrayOfNumbers[i] = sc.nextInt();
            if (i < 5 && arrayOfNumbers[i] <= 0) { checkPositiveNumber = false; }
        }

        if (checkPositiveNumber) {
            for (int i = 0; i < arrayOfNumbers.length / 2; i++) {
                sum += arrayOfNumbers[i];
            }
            System.out.println("**********");
            System.out.printf("The sum of first %d elements is %d", arrayOfNumbers.length / 2, sum);
        } else {
            for (int i = arrayOfNumbers.length - 1; i >= arrayOfNumbers.length / 2; i--) {
                multiplication *= arrayOfNumbers[i];
            }
            System.out.println("**********");
            System.out.printf("The multiplication of last %d elements is %d", arrayOfNumbers.length / 2, multiplication);
        }
    }
}
