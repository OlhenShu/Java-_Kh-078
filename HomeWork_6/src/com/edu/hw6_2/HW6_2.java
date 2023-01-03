package com.edu.hw6_2;

public class HW6_2 {
    public static void main(String[] args) {
        System.out.println("*** Information about the Employee instance ***");
        Employee employee = new Employee("Olena", 30, 100000.00);
        System.out.println(employee.report());

        System.out.println("\n*** Information about the Developer instance ***");
        Employee developer = new Developer("Taras", 32, 32735.35,"Average Java developer");
        System.out.println(developer.report());
    }
}
