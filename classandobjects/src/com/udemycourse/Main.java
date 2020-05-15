package com.udemycourse;

import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
       car hyundai = new car();
       car maruti = new car();
       hyundai.setModel("i10");
       hyundai.setDoors();
        System.out.println(hyundai.getModel());
        System.out.println(hyundai.getDoors());
        hyundai.setModel("baleno");
        hyundai.setDoors();
        System.out.println(hyundai.getModel());
        System.out.println(hyundai.getDoors());


    }
}
