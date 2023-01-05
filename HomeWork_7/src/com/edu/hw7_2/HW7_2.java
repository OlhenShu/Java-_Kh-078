package com.edu.hw7_2;

public class HW7_2 {
    public static void main(String[] args) {
        Liner liner = new Liner();
        liner.setPassengers(500);
        liner.setFloors(5);

        Boat boat = new Boat();
        boat.setPassengers(6);
        boat.setVolume(10);

        Plane plane = new Plane();
        plane.setPassengers(100);
        plane.setMaxDistance(2000);

        Helicopter helicopter = new Helicopter();
        helicopter.setPassengers(10);
        helicopter.setWeight(6900);
        helicopter.setMaxHeight(4700);

        Bus bus = new Bus();
        bus.setPassengers(40);
        bus.setRoute("Kyiv-Lviv");

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setPassengers(2);
        motorcycle.setMaxSpeed(250);

        Car car = new Car();
        car.setPassengers(5);
        car.setModel("BMW");

        System.out.println(liner);
        liner.isSailing();
        System.out.println(boat);
        boat.isSailing();
        System.out.println(plane);
        plane.fly();
        plane.land();
        System.out.println(helicopter);
        helicopter.fly();
        helicopter.land();
        System.out.println(bus);
        bus.drive();
        System.out.println(motorcycle);
        motorcycle.drive();
        System.out.println(car);
        car.drive();
    }
}
