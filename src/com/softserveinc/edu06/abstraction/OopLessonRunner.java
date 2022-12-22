package com.softserveinc.edu06.abstraction;

public class OopLessonRunner {

    public static void main(String[] args) {

        Computer laptop = new Laptop(new Ssd(512),new Ram(16),2);
        Computer mobile = new Mobile(new Ssd(128), new Ram(8));

        loadComputers(laptop, mobile);
        printInformation(new Computer[]{laptop, mobile});
    }

    public static void printInformation(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
            System.out.println();
        }
    }

    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}