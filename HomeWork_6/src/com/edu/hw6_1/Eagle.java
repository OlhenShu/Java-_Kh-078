package com.edu.hw6_1;

public class Eagle extends FlyingBird{
    public Eagle() {
        super();
    }

    public Eagle(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return String.format("Eagle (feathers: %s, layEggs: %s)", this.getFeathers(), this.getLayEggs());
    }
}
