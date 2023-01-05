package com.edu.hw7_2;

public class Liner extends WaterVehicle{
    private int floors;

    public Liner() {
        super();
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("The liner is sailing...");
    }

    @Override
    public String toString() {
        return String.format("Liner (passenger capacity: %d, floors: %d)", this.getPassengers(), this.getFloors());
    }
}
