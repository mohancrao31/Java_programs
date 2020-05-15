package com.udemycourse;

public class Monitor {
    private int dimension;
    private Resolution resolution;
    private String brand;

    public Monitor(int dimension, Resolution resolution, String brand) {
        this.dimension = dimension;
        this.resolution = resolution;
        this.brand = brand;

    }

    public int getDimension() {
        return dimension;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public String getBrand() {
        return brand;
    }
}
