package com.edu.hw7_1;

public class Employee implements Comparable{
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private final String employeeId;
    private static int idCounter = 0;

    public Employee() {
        this.employeeId = String.format("%05d", ++idCounter);
    }

    public Employee(String firstName, String lastName, int age, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.employeeId = String.format("%05d", ++idCounter);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public int compareTo(Object o) {
        if (this instanceof SalariedEmployee && o instanceof SalariedEmployee) {
            return - Double.compare(((SalariedEmployee) this).calculatePay(), ((SalariedEmployee) o).calculatePay());
        } else if (this instanceof SalariedEmployee && o instanceof ContractEmployee) {
            return - Double.compare(((SalariedEmployee) this).calculatePay(), ((ContractEmployee) o).calculatePay());
        } else if (this instanceof ContractEmployee && o instanceof SalariedEmployee) {
            return - Double.compare(((ContractEmployee) this).calculatePay(), ((SalariedEmployee) o).calculatePay());
        } else if (this instanceof ContractEmployee && o instanceof ContractEmployee) {
            return - Double.compare(((ContractEmployee) this).calculatePay(), ((ContractEmployee) o).calculatePay());
        } else {
            return 0;
        }
    }

    public static void displayEmployees(Employee[] array) {
        for (Employee employee : array) {
            System.out.printf("ID: %s, Name: %s %s, ", employee.getEmployeeId(), employee.getFirstName(), employee.getLastName());
            if (employee instanceof SalariedEmployee) {
                System.out.printf("AVG monthly wage: $%.2f", ((SalariedEmployee)employee).calculatePay());
            } else if (employee instanceof ContractEmployee) {
                System.out.printf("AVG monthly wage: $%.2f", ((ContractEmployee)employee).calculatePay());
            }
            System.out.println();
        }
    }
}
