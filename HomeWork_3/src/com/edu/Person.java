package com.edu;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        Year currentYear = Year.now();
        return currentYear.getValue() - this.getBirthYear();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("First name: ");
        this.setFirstName(sc.nextLine());
        System.out.print("Last name: ");
        this.setLastName(sc.nextLine());
        System.out.print("Year of birth: ");
        this.setBirthYear(sc.nextInt());
    }

    public void output() {
        System.out.printf("%s %s is %d years old\n", this.getFirstName(), this.getLastName(), this.getAge());
    }

    public void changeName(String fn, String ln) {
        this.setFirstName(fn);
        this.setLastName(ln);
    }

    public void changeName(String fn) {
        this.setFirstName(fn);
    }
}
