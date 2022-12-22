package com.softserveinc.edu06.abstraction;

public class Mobile extends Computer {

    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }

    @Override
    public void load() {
        System.out.println("I switched on");
    }
}