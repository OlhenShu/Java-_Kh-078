package com.edu.hw6_1;

public class Penguin extends NonFlyingBird{
    public Penguin() {
        super();
    }

    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return String.format("Penguin (feathers: %s, layEggs: %s)", this.getFeathers(), this.getLayEggs());
    }
}
