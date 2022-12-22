package com.softserveinc.edu07;

public class TestInterface implements Volumetric, Volume{
    @Override
    public double getVolume() {
        System.out.println("This text is from class TestInterface");
        return 0;
    }


    @Override
    public void printSomeDate() {
        System.out.println("That text from class Test");

    }
}
