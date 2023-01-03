package com.edu.hw6_1;

public class Swallow extends FlyingBird{
    public Swallow() {
        super();
    }

    public Swallow(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return String.format("Swallow (feathers: %s, layEggs: %s)", this.getFeathers(), this.getLayEggs());
    }
}
