package com.softserveinc.edu10.set;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>();
        Student s1 = new Student("Olha",1);
        Student s2 = new Student("Oleh",5);
        Student s3 = new Student("Natalia",4);
        Student s4 = new Student("Dmytro",2);
        Student s5 = new Student("Ihor",3);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        Student s6 = new Student("Anna",3);
        System.out.println(treeSet.headSet(s6));
        System.out.println(treeSet.tailSet(s6));
        Student s7 = new Student("Anna",2);
        Student s8 = new Student("Anna",4);
        System.out.println(treeSet.subSet(s7,s8));





    }
}
class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + course;
        return result;
    }
}