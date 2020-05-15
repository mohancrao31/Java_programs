package com.udemycourse;

public class Dog extends Animals {

    private int legs;
    private String breed;
    public Dog(String name, int brain, int body, int size, int weight, int legs, String breed) {
        super(name, brain, body, size, weight);
        this.legs = legs;
        this.breed = breed;
    }
    }