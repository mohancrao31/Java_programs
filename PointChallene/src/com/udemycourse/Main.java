package com.udemycourse;

public class Main {

    public static void main(String[] args) {
	// write your code here
//
//        Point P1 = new Point(6,5);
//        Point P2 = new Point(3,1);
//
//        Point point = new Point();
//        System.out.println(point.distance());
//        System.out.println("Distance between the two Points P1 & P2 are " + P2.distance(P1));
//        System.out.println(" Distance(0,0) = " + P1.distance());
//        System.out.println("Distance (2,2)= " + P1.distance(2,2);

        Floor House1 = new Floor(10,20);
        Carpet C1 = new Carpet(8);

        Calculator Ca1 = new Calculator(House1,C1);
        System.out.println("the total cost of carpeting the area is = " + Ca1.getTotalCost());
    }
}
