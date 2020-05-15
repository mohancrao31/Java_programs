package com.udemycourse;

public class Fish extends Animals{
    private int eyes;
    private int gills;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int eyes, int gills, int fins) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.gills = gills;
        this.fins = fins;
    }
}
