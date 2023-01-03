package com.softserveinc.edu08;

public class DemoPerson1 {
    public static void main(String[] args) {
       // Person1 person = new Person1(28);

        Person1.FullName personWithName = new Person1(28).new FullName("Oleg", "Kostenko");
        personWithName.info();

    }
}
