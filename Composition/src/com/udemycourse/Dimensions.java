package com.udemycourse;

public class Dimensions {

    private int length;
    private int width;
    private int height;

    public Dimensions(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    private int getArea(){
        return length*width;
    }

    private int volume(){
        return getArea()*height;
    }
}
