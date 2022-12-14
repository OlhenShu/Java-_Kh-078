package com.edu;

import java.util.Arrays;
import java.util.Scanner;

public class HW4_2 {
    public static void main(String[] args) {
        Dog dog1st = new Dog();
        Dog dog2nd = new Dog();
        Dog dog3rd = new Dog();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the information about the 1st dog:");
        System.out.print("Name: ");
        dog1st.setName(sc.nextLine());
        System.out.printf("Breed %s: ", Arrays.toString(Breed.values()).toLowerCase());
        dog1st.setBreed(Breed.valueOf(sc.nextLine().toUpperCase()));
        System.out.print("Age: ");
        dog1st.setAge(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter the information about the 2nd dog:");
        System.out.print("Name: ");
        dog2nd.setName(sc.nextLine());
        System.out.printf("Breed %s: ", Arrays.toString(Breed.values()).toLowerCase());
        dog2nd.setBreed(Breed.valueOf(sc.nextLine().toUpperCase()));
        System.out.print("Age: ");
        dog2nd.setAge(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter the information about the 3rd dog:");
        System.out.print("Name: ");
        dog3rd.setName(sc.nextLine());
        System.out.printf("Breed %s: ", Arrays.toString(Breed.values()).toLowerCase());
        dog3rd.setBreed(Breed.valueOf(sc.nextLine().toUpperCase()));
        System.out.print("Age: ");
        dog3rd.setAge(sc.nextInt());

        System.out.println("**********");
        if (dog1st.getName().equalsIgnoreCase(dog2nd.getName()) || dog2nd.getName().equalsIgnoreCase(dog3rd.getName()) ||
                dog3rd.getName().equalsIgnoreCase(dog1st.getName())) {
            System.out.println("You have entered dogs with the same name");
        }
        System.out.printf("The oldest dog name is %s", Dog.getOldestDog().getName());
    }
}
