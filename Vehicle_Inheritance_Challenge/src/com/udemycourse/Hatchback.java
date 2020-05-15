package com.udemycourse;

public class Hatchback extends Car{

    private int noofdoors;
    private String color;
    private String model;

    public Hatchback(int speed, int noofdoors, int noofgears, String steering, String color, String model){
        super(noofgears,steering, speed);
        this.color = color;
        this.model = model;


    }

    public int getNoofdoors() {
        return noofdoors;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
