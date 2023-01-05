package com.edu.hw7_2;

public class Car extends GroundVehicle{
    private String model;

    public Car() {
        super();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("The car is driving...");
    }

    @Override
    public String toString() {
        return String.format("Car (passenger capacity: %d, model: %s)", this.getPassengers(), this.getModel());
    }
}
