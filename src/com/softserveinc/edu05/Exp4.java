package com.softserveinc.edu05;

import java.util.Scanner;

public class Exp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input number");
            n = sc.nextInt();
            if (n < 0){
                continue;
            }
            sum += n;
        }
        System.out.println("Sum is " + sum);
        sc.close();

    }
}
