package com.softserveinc.edu05;

public class Exp5 {
    public static void main(String[] args) {
        int[] arr = {2, -5, 7, -4, 8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { sum += arr[i];}
        System.out.println("Sum = " + sum);

        int product = 1;
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {product = product * arr[i];}}
        System.out.println("Product = " + product);

        int amount = 0;
        for (int a : arr) {
            if (a > 0 && a < 7) { amount++; }
        }
        System.out.println("Amount = " + amount);

        int max = arr[0];
        int imax = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
            }
            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");




    }
}
