package com.edu;

import java.util.Scanner;

public class HW5_4 {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.printf("Enter the information about the %d car:\n", i + 1);
            System.out.print("Type: ");
            cars[i].setType(sc.nextLine());
            System.out.print("Year of production: ");
            cars[i].setProductionYear(sc.nextInt());
            System.out.print("Engine capacity: ");
            cars[i].setEngineCapacity(sc.nextFloat());
            sc.nextLine();
        }

        System.out.println("**********");
        System.out.print("Enter the year of production: ");
        int productionYear = sc.nextInt();
        if (Car.isCarExists(cars, productionYear)) { Car.displayCars(cars, productionYear); }
        else { System.out.println("There are no exist any cars with the entered year of production"); }

        System.out.println("**********");
        System.out.println("See below the list of cars sorted by production year:");
        Car.displayCars(Car.sortCarsByYear(cars));
    }
}
