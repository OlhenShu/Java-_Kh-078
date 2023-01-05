package com.edu.hw7_2;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle() {
        super();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("The motorcycle is driving...");
    }

    @Override
    public String toString() {
        return String.format("Motorcycle (passenger capacity: %d, max speed: %d kmh)",
                this.getPassengers(), this.getMaxSpeed());
    }
}
