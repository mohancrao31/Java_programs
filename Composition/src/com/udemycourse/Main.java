package com.udemycourse;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Furniture furn1 = new Furniture(2, new Almirah(new Dimension(20,10)), new Bed("Queen"));
    House roommaster = new House("Master", new Dimensions(12,11,11),furn1);

    House room2 = new House("Ajji", new Dimensions(12,11,11),new Furniture(1,new Almirah(new Dimension(10,10)),new Bed("King")));
    House room3 = new House("Momdad",new Dimensions(12,11,11),new Furniture(1,new Almirah(new Dimension(10,10)),new Bed("King"))) ;

        System.out.println(room2.getClass().getSimpleName());
    }
}
