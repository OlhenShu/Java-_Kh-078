package com.edu.hw7_2;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane() {
        super();
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("The plane is flying...");
    }

    @Override
    public void land() {
        System.out.println("The plane landed");
    }

    @Override
    public String toString() {
        return String.format("Plane (passenger capacity: %d, max distance: %d km)",
                this.getPassengers(), this.getMaxDistance());
    }
}
