package com.softserveinc.edu03;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Ira", 25);
     //   Student student2 = student1;
        Student student2 = new Student("IRA", 25);

        System.out.println(student1 == student2);
       System.out.println(student1.equals(student2));

    }
}
