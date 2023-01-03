//package com.softserveinc.edu08;
//
//interface Formula {
//    double calculate(int a);
//
//    default double sqrt(int a) {return Math.sqrt(a); }
//}
//
//    Formula formula = new Formula() {
//    @Override
//    public double calculate(int a) {
//        return sqrt(a * 5);
//    }
//    };
//double result = formula.calculate(20);
//System.out.println("Square root of 100 is " + result);
