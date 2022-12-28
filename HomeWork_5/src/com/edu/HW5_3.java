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

        System.out.println("**********");
        switch (quantityPositiveElements(array)) {
            case 0 -> System.out.println("You haven't entered any positive number");
            case 1 -> System.out.println("You have entered only one positive number");
            default -> System.out.printf("The position of the 2nd positive number is %d (index %d)\n",
                    indexOf2ndPositiveElement(array) + 1, indexOf2ndPositiveElement(array));
        }
        System.out.printf("The min element is %d at position %d (index %d)\n",
                array[indexOfMinElement(array)], indexOfMinElement(array) + 1, indexOfMinElement(array));
        if (multOfEvenElements(array) == 1) {
            System.out.println("You haven't entered any even number");
        } else {
            System.out.printf("The multiplication of all entered even numbers is %d\n", multOfEvenElements(array));
        }
    }

    public static int quantityPositiveElements (int[] array) {
        int result = 0;
        for (int element : array) {
            if (element > 0) { result++; }
        }
        return result;
    }

    public static int indexOf2ndPositiveElement (int[] array) {
        int result = -1;
        int counterPositiveElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counterPositiveElements ++;
                if (counterPositiveElements == 2) { result = i; }
            }
        }
        return result;
    }

    public static int indexOfMinElement (int[] array) {
        int result = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[result] > array[i]) { result = i; }
        }
        return result;
    }

    public static int multOfEvenElements (int[] array) {
        int result = 1;
        for (int element : array) {
            if (element % 2 == 0) { result *= element; }
        }
        return result;
    }
}
