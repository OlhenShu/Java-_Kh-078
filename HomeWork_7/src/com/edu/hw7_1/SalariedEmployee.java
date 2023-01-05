package com.edu.hw7_1;

public class SalariedEmployee extends Employee implements Payment {
    private double salary;
    private String socialSecurityNumber;

    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String firstName, String lastName, int age, String position, double salary, String socialSecurityNumber) {
        super(firstName, lastName, age, position);
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("SalariedEmployee (%s %s, %d years, '%s', id:%s, SSN:%s, salary: $%.2f)",
                this.getFirstName(), this.getLastName(), this.getAge(), this.getPosition(),
                this.getEmployeeId(), this.getSocialSecurityNumber(), this.getSalary());
    }

    @Override
    public double calculatePay() {
        return this.getSalary();
    }
}
