package com.edu.hw7_2;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat() {
        super();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("The boat is sailing...");
    }

    @Override
    public String toString() {
        return String.format("Boat (passenger capacity: %d, volume: %d m3)", this.getPassengers(), this.getVolume());
    }
}
