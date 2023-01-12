package com.edu;

public class HW8 {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("Stepan", "Stepanenko"), 17, 1);
        Student student2 = new Student(new FullName("Olena", "Shevchenko"), 20, 4);

        System.out.println("Original list of students:");
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());

        try {
            Student student3 = (Student) student1.clone();

            student3.setCourse(2);
            student3.setAge(18);
            student3.setFullName("Vasyl", "Vasylenko");

            System.out.println("**********");
            System.out.println("Current list of students:");
            System.out.println(student1.info());
            System.out.println(student1.activity());
            System.out.println(student2.info());
            System.out.println(student2.activity());
            System.out.println(student3.info());
            System.out.println(student3.activity());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
