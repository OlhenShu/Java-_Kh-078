package com.softserveinc.edu06;

public class Main {
    public static void main(String[] args) {
      //  Rectangle rectangle = new Rectangle();
      //  rectangle.width = 42;
       // rectangle.height = 74;

        Parallelogram parallelogram = new Parallelogram(25,50,60);
      //  parallelogram.width = 42;   // inherit from Rectangle
     //   parallelogram.height = 74;  // inherit from Rectangle
    //    parallelogram.angle = 35;

       double p1 = parallelogram.getPerimeter();// inherit from Rectangle
      double p2 = parallelogram.getArea();

        System.out.println("Perimeter of parallelogram equals " + p1);
       System.out.println("Area of parallelogram equals " + p2);
    }
}