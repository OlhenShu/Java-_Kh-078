package com.edu.hw6_1;

public class NonFlyingBird extends Bird{
    public NonFlyingBird() {
        super();
    }

    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird can not fly!");
    }
}
