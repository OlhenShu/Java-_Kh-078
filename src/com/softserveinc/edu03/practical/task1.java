package com.softserveinc.edu03.practical;

public class task1 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3};
       int i;
        int oddNumber = 0;
        for( i = 0; i <  numbers.length; i++){
            if(numbers[i] %2 != 0) {
                oddNumber++;
            }
        }
        System.out.println("There are " + oddNumber);
    }
}
