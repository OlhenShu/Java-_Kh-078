package com.edu.hw7_2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter() {
        super();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("The helicopter is flying...");
    }

    @Override
    public void land() {
        System.out.println("The helicopter landed");
    }

    @Override
    public String toString() {
        return String.format("Helicopter (passenger capacity: %d, weight: %d kg, max height: %d m)",
                this.getPassengers(), this.getWeight(), this.getMaxHeight());
    }
}
