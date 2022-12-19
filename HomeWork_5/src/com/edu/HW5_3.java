package com.edu;

import java.util.Scanner;

public class HW5_3 {
    public static void main(String[] args) {
        int[] array = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter the %d number: ", i + 1);
            array[i] = sc.nextInt();
        }

        int secondPositiveElementIndex = 0;
        int counterPositiveElements = 0;
        int minElement = array[0];
        int minElementIndex = 0;
        int multiplication = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counterPositiveElements ++;
                if (counterPositiveElements == 2) { secondPositiveElementIndex = i; }
            }
            if (minElement > array[i]) {
                minElement = array[i];
                minElementIndex = i;
            }
            if (array[i] % 2 == 0) { multiplication *= array[i]; }
        }

        System.out.println("**********");
        switch (counterPositiveElements) {
            case 0 -> System.out.println("You haven't entered any positive number");
            case 1 -> System.out.println("You haven entered only one positive number");
            default -> System.out.printf("The position of the 2nd positive number is %d (index %d)\n",
                    secondPositiveElementIndex + 1, secondPositiveElementIndex);
        }
        System.out.printf("The min element is %d at position %d (index %d)\n",
                minElement, minElementIndex + 1, minElementIndex);
        if (multiplication == 1) {
            System.out.println("You haven't entered any even number");
        } else {
            System.out.printf("The multiplication of all entered even numbers is %d\n", multiplication);
        }
    }
}
