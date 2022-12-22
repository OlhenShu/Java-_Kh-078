package com.softserveinc.edu06;

public class Parallelogram extends Rectangle {
    public int angle;

    public Parallelogram(int width, int height, int angle) {
        super(width, height);
        this.angle = angle;
    }

    public int getArea() {
        return (int) (getWidth() * getHeight() * Math.sin(angle * Math.PI / 180));
    }


    public int getPerimeter() {
        return 0;
    }
}

