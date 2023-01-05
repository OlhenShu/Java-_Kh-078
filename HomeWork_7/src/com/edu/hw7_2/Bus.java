package com.edu.hw7_2;

public class Bus extends GroundVehicle{
    private String route;

    public Bus() {
        super();
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("The bus is driving...");
    }

    @Override
    public String toString() {
        return String.format("Bus (passenger capacity: %d, route: '%s')", this.getPassengers(), this.getRoute());
    }
}
