package com.edu.hw7_1;

public class ContractEmployee extends Employee implements Payment {
    private double hourlyRate;
    private int workingHours;
    private String federalTaxIdMember;

    public ContractEmployee() {
        super();
    }

    public ContractEmployee(String firstName, String lastName, int age, String position, double hourlyRate, int workingHours, String federalTaxIdMember) {
        super(firstName, lastName, age, position);
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public String toString() {
        return String.format("ContractEmployee (%s %s, %d years, '%s', id:%s, TIN:%s, salary per hour: $%.2f, hours: %d)",
                this.getFirstName(), this.getLastName(), this.getAge(), this.getPosition(),
                this.getEmployeeId(), this.getFederalTaxIdMember(), this.getHourlyRate(), this.getWorkingHours());
    }

    @Override
    public double calculatePay() {
        return this.getHourlyRate() * this.getWorkingHours();
    }
}
