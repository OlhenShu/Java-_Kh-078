package com.edu.hw6_1;

public class HW6_1 {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("grey", "in the aerie");
        birds[1] = new Penguin("black", "in the clutch");
        birds[2] = new Swallow("black", "in the nest");
        birds[3] = new Chicken("white", "in the henhouse");

        for (Bird bird : birds) {
            System.out.println(bird);
            bird.fly();
        }
    }
}
