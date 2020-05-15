package com.udemycourse;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hatchback BA = new Hatchback(200,5,6,"Hydraulic","Green","i10" );
        Hatchback IB = new Hatchback(240,5,6,"Manual","red", "i20");
        Vehicle hyundai = new Vehicle();


        System.out.println(hyundai.getSteering());
        System.out.println(IB.getSpeed());

        System.out.println(IB.getNoofgears());
    }
}
