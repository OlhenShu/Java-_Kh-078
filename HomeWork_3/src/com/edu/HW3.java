package com.edu;

public class HW3 {
    public static void main(String[] args) {
        Person person1st = new Person();
        Person person2nd = new Person();
        Person person3rd = new Person();
        Person person4th = new Person();
        Person person5th = new Person();

        System.out.println("Enter the information about the 1st person");
        person1st.input();
        System.out.println("Enter the information about the 2nd person");
        person2nd.input();
        System.out.println("Enter the information about the 3rd person");
        person3rd.input();
        System.out.println("Enter the information about the 4th person");
        person4th.input();
        System.out.println("Enter the information about the 5th person");
        person5th.input();

        System.out.println("**********");
        System.out.println("See the information about all persons below:");
        person1st.output();
        person2nd.output();
        person3rd.output();
        person4th.output();
        person5th.output();
    }
}
