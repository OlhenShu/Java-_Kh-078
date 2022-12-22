package com.softserveinc.edu06.abstraction;

/**
 * Laptop <- Computer <- Object
 */
public final  class Laptop extends Computer {

    private int weight;

    public Laptop() {
            }
    public Laptop(Ssd ssd, Ram ram,int weight) {
        super(ssd, ram);
        this.weight = weight;

    }

    @Override
    public void load() {
        open();
        System.out.println("I'm loaded");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("weight: " + weight);
    }

    public void open() {

        System.out.println("I opened the lid");
    }

    public int getWeight() {

        return weight;
    }
}