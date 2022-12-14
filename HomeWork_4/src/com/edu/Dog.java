package com.edu;

enum Breed {
    SHEEPDOG,
    POODLE,
    SETTER,
    BULLDOG,
    DALMATIAN,
    COLLIE,
    MASTIFF,
    DOBERMAN,
    LABRADOR
}

public class Dog {
    private String name;
//    private enum breed {SHEEPDOG, POODLE, SETTER, BULLDOG, DALMATIAN, COLLIE, MASTIFF, DOBERMAN, LABRADOR};
    private Breed breed;
    private int age;
    private static Dog oldestDog = null;

    public Dog() {
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        if (oldestDog == null || oldestDog.getAge() < age) { oldestDog = this; }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (oldestDog == null || oldestDog.getAge() < age) { oldestDog = this; }
    }

    public static Dog getOldestDog() {
        return oldestDog;
    }

    @Override
    public String toString() {
        return this.getName() + " is a " + this.getBreed().toString().toLowerCase() +
                ". He/She is " + this.getAge() + " year/s old.";
    }
}
