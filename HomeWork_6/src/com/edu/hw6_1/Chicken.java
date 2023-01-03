package com.edu.hw6_1;

public class Chicken extends NonFlyingBird{
    public Chicken() {
        super();
    }

    public Chicken(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return String.format("Chicken (feathers: %s, layEggs: %s)", this.getFeathers(), this.getLayEggs());
    }
}
