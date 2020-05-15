package com.udemycourse;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ComplexNumber one = new ComplexNumber(50,1);
        ComplexNumber number = new ComplexNumber(2,2);
        number.add(one);
        System.out.println(number.getReal());
        System.out.println(number.getImaginary());
        number.subtract(5,6);
        System.out.println(number.getImaginary());
        System.out.println(number.getReal());
    }
}
