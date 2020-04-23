package com.udemycourse;

public class AreaCalculator {
    private static final int INVALID_VALUE_ERROR = -1;

    public static double area(double radius) {          //Method to Return area of circle with radius as input//
        if (radius < 0) {
            return INVALID_VALUE_ERROR;
        } else {
            double area_of_circle = Math.PI * radius * radius;
            return area_of_circle;
        }
    }

    public static double area(double length, double breadth) {           //Method to calculate and return area of rectangle//
        if (length < 0 || breadth < 0) {
            return INVALID_VALUE_ERROR;
        } else {
            double area_of_rectangle = length * breadth;
            return area_of_rectangle;
        }
    }
}







