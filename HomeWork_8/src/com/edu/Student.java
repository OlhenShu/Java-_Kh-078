package com.edu;

public class Student extends Person implements Cloneable {
    private int course;

    public Student() {
        super();
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return String.format("%s, course: %d", super.info(), this.getCourse());
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();
        copyOfStudent.setFullName((FullName) copyOfStudent.getFullName().clone());
        return copyOfStudent;
    }
}
