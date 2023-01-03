package com.edu.hw6_1;

public class FlyingBird extends Bird{
    public FlyingBird() {
        super();
    }

    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird can fly!");
    }
}
