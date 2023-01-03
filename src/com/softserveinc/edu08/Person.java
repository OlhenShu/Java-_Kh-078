package com.softserveinc.edu08;

public class Person {
private FullName fullName = new FullName();
private int age;

public Person(String firsName, String lastName, int age) {
fullName.firstName = firsName;
fullName.lastName = lastName;
this.age = age;
}

@Override
public String toString() {
return "Person [fullName=" + fullName + ", age=" + age + "]";
}

private class FullName {
private String firstName;
private String lastName;
@Override
public String toString() {
return "FullName [firstName=" + firstName + ", lastName=" + lastName + "]";
}
}
}
