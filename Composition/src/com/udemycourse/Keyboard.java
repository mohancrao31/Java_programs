package com.udemycourse;

public class Keyboard {

    private String brand;
    private int length;
    private int breadth;
    private boolean isBluetooth;

    public Keyboard(String brand, int length, int breadth, boolean isBluetooth) {
        this.brand = brand;
        this.length = length;
        this.breadth = breadth;
        this.isBluetooth = isBluetooth;
    }

    public String getBrand() {
        return brand;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public boolean isBluetooth() {
        return isBluetooth;
    }
}
