package com.edu.hw7_2;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
        super();
    }

    public abstract void fly();

    public abstract void land();
}
