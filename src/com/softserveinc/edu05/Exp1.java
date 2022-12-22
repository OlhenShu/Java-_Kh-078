package com.softserveinc.edu05;

//import java.util.Arrays;

import java.util.Arrays;

public class Exp1 {
    public static void main(String[] args) {

        int monthDays [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
        int[] monthDays2 = new int[12];

        int monthDays3[];
        int n = 12;
        monthDays3 = new int[n];
        monthDays3[0] = 31;
        monthDays3[1] = 28;
        monthDays3[2] = 31;
        monthDays3[3] = 30;
        monthDays3[4] = 31;
        monthDays3[5] = 30;
        monthDays3[6] = 31;
        monthDays3[7] = 31;
        monthDays3[8] = 30;
        monthDays3[9] = 31;
        monthDays3[10] = 30;
        monthDays3[11] = 31;

        System.out.println(monthDays.length);
       System.out.println(monthDays);
        System.out.println(Arrays.toString(monthDays));
       System.out.println(monthDays == monthDays3);
       System.out.println(Arrays.equals(monthDays,monthDays3));
    }
}
