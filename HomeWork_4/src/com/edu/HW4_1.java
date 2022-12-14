package com.edu;

import java.util.Scanner;

public class HW4_1 {
    public static void main(String[] args) {
        /* ----- 1st subtask ----- */
        int counter = 0;
        int lowRangeLimit = -5;
        int upperRangeLimit = 5;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st float number: ");
        float floatNumber = sc.nextFloat();
        if (floatNumber >= lowRangeLimit && floatNumber <= upperRangeLimit) { counter++; }
        System.out.print("Enter the 2nd float number: ");
        floatNumber = sc.nextFloat();
        if (floatNumber >= lowRangeLimit && floatNumber <= upperRangeLimit) { counter++; }
        System.out.print("Enter the 3rd float number: ");
        floatNumber = sc.nextFloat();
        if (floatNumber >= lowRangeLimit && floatNumber <= upperRangeLimit) { counter++; }

        switch (counter) {
            case 1 -> System.out.printf("You have entered only 1 number that belongs to the range [%d:%d]\n",
                    lowRangeLimit, upperRangeLimit);
            case 2 -> System.out.printf("You have entered 2 numbers that belong to the range [%d:%d]\n",
                    lowRangeLimit, upperRangeLimit);
            case 3 -> System.out.printf("All entered numbers belong to the range [%d:%d]\n",
                    lowRangeLimit, upperRangeLimit);
            default -> System.out.printf("None of the entered numbers belong to the range [%d:%d]\n",
                    lowRangeLimit, upperRangeLimit);
        }

        /* ----- 2nd subtask ----- */
        System.out.println("**********");
        System.out.print("Enter the 1st integer number: ");
        int integerNumber = sc.nextInt();
        int minNumber = integerNumber;
        int maxNumber = integerNumber;
        int minCounter = 1;
        int maxCounter = 1;
        System.out.print("Enter the 2nd integer number: ");
        integerNumber = sc.nextInt();
        if (integerNumber > maxNumber) { maxNumber = integerNumber; }
        else if (integerNumber == maxNumber) { maxCounter++; }
        if (integerNumber < minNumber) { minNumber = integerNumber; }
        else if (integerNumber == minNumber) { minCounter++; }
        System.out.print("Enter the 3rd integer number: ");
        integerNumber = sc.nextInt();
        if (integerNumber > maxNumber) { maxNumber = integerNumber; }
        else if (integerNumber == maxNumber) { maxCounter++; }
        if (integerNumber < minNumber) { minNumber = integerNumber; }
        else if (integerNumber == minNumber) { minCounter++; }

        if (maxCounter == 1) { System.out.printf("The MAX number is '%d'\n", maxNumber); }
        else { System.out.printf("%d MAX numbers are '%d'\n", maxCounter, maxNumber); }
        if (minCounter == 1) { System.out.printf("The MIN number is '%d'\n", minNumber); }
        else { System.out.printf("%d MIN numbers are '%d'\n", minCounter, minNumber); }

        /* ----- 3rd subtask ----- */
        System.out.println("**********");
        System.out.print("Enter a HTTP Error code (3 digits): ");
        int errorCode = sc.nextInt();
        if (errorCode >= 400 && errorCode <= 417 || errorCode >= 500 && errorCode <= 505) {
            System.out.printf("The name of the error '%d' is '%s'\n", errorCode, HTTPError.valueOf("ERROR_" + errorCode).getErrorName());
        } else {
            System.out.println("You have entered the wrong error code!");
        }
    }
}
