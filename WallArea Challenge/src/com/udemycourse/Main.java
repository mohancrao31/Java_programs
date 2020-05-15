package com.udemycourse;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        Wall wall2 = new Wall();
        wall2.setWidth(25);
        wall2.setHeight(80);

        wall.setHeight(-1.5);
        System.out.println(" width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());
        System.out.println(wall2.getArea());

    }
}
