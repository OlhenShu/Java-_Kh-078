package com.softserveinc.edu03;

public class Season {
    private String season;
    public static Season WINTER = new Season("WINTER");
    public static Season AUTOM = new Season("AUTOM");
    public static Season SPRING = new Season("SPRING");
    public static Season SUMMER = new Season("SUMMER");

    private Season(String season) {
        this.season = season;
    }
}

class Appl {
    public static void main(String[] args) {
        Season season = Season.WINTER;
     //   Season season1 = new Season("Java Core"); // compile error
    }
}

