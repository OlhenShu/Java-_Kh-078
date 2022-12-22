package com.softserveinc.edu05;

import java.util.Arrays;

public class Exp6 {
    public static void main(String[] args) {

        int[] numbers = { 2, -5, 8, -4, 7 };

        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, 7);
        String elements = Arrays.toString(numbers);
        System.out.println("Numbers = " + elements);
        System.out.println("Position of element with value 7 is " + index);

    }
}
