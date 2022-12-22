package com.softserveinc.edu05;

import java.util.Scanner;

public class Exp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input number");
            n = sc.nextInt();
            if (n < 0){
                break;
            }
        }
        System.out.println(n);
        sc.close();
    }


}
