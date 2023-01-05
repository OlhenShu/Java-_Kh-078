package com.edu.hw7_1;

import java.util.Arrays;

public class HW7_1 {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Mykola", "Mykolenko", 30, "Senior Java Developer", 6000, "000-11-1111"),
                new SalariedEmployee("Petro", "Petrenko", 25, "Middle Python Developer", 2000, "000-22-2222"),
                new ContractEmployee("Olena", "Shevchenko", 27, "Senior Business Analytic", 30, 80, "999-33-3333"),
                new ContractEmployee("Hanna", "Moloda", 19, "Trainee Ruby Developer", 5, 120, "999-44-4444"),
                new SalariedEmployee("Stepan", "Stepanenko", 21, "Junior Python Developer", 800, "000-55-5555"),
                new SalariedEmployee("Vasyl", "Vasylenko", 20, "Junior Java Developer", 1000, "000-66-6666")
        };

        System.out.println("Original list of employees:");
        Employee.displayEmployees(employees);

        System.out.println("**********");
        System.out.println("List of employees sorted by the average monthly wage in descending order:");
        Arrays.sort(employees);
        Employee.displayEmployees(employees);
    }
}
