package com.edu;

import java.util.Scanner;

public class HW5_2 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.printf("Enter the %d number: ", i + 1);
            arrayOfNumbers[i] = sc.nextInt();
        }

        System.out.println("**********");
        if (checkIfFirst5ElementsArePositive(arrayOfNumbers)) {
            System.out.printf("The sum of first 5 elements is %d", sumOfFirst5Elements(arrayOfNumbers));
        } else {
            System.out.printf("The multiplication of last 5 elements is %d", multOfLast5Elements(arrayOfNumbers));
        }
    }

    public static boolean checkIfFirst5ElementsArePositive (int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] <= 0) { return false; }
        }
        return true;
    }

    public static int sumOfFirst5Elements (int[] array) {
        int result = 0;
        for (int i = 0; i < array.length / 2; i++) { result += array[i]; }
        return result;
    }

    public static int multOfLast5Elements (int[] array) {
        int result = 1;
        for (int i = array.length - 1; i >= array.length / 2; i--) { result *= array[i]; }
        return result;
    }
}
